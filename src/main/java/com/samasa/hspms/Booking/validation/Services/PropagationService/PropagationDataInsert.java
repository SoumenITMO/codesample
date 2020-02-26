package com.samasa.hspms.Booking.validation.Services.PropagationService;

import com.samasa.hspms.Booking.validation.Dao.FrmMealPlanDetailDao;
import com.samasa.hspms.Booking.validation.Dao.FrmRateDailyBookingDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstMealPlanDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstRateDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstRevDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstSplServiceDailyDao;
import com.samasa.hspms.Booking.validation.Dto.Propagation.PropagationData;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.FrmMealPlanDetail;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstMealPlanDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstRateDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstRevDaily;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgVstSplServiceDaily;
import com.samasa.hspms.common.dto.LoginDetails;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.impl.client.HttpClients;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
@Transactional
public class PropagationDataInsert {

    private OcmTrBkgVstMealPlanDailyDao ocmTrBkgVstMealPlanDailyDao;
    private OcmTrBkgVstRateDailyDao ocmTrBkgVstRateDailyDao;
    private OcmTrBkgVstRevDailyDao ocmTrBkgVstRevDailyDao;
    private OcmTrBkgVstSplServiceDailyDao ocmTrBkgVstSplServiceDailyDao;
    private FrmRateDailyBookingDao frmRateDailyBookingDao;
    private FrmMealPlanDetailDao frmMealPlanDetailDao;

    public PropagationDataInsert(OcmTrBkgVstMealPlanDailyDao ocmTrBkgVstMealPlanDailyDao,
                                 OcmTrBkgVstRateDailyDao ocmTrBkgVstRateDailyDao,
                                 OcmTrBkgVstRevDailyDao ocmTrBkgVstRevDailyDao,
                                 OcmTrBkgVstSplServiceDailyDao ocmTrBkgVstSplServiceDailyDao,
                                 FrmRateDailyBookingDao frmRateDailyBookingDao,
                                 FrmMealPlanDetailDao frmMealPlanDetailDao) {
        this.ocmTrBkgVstMealPlanDailyDao = ocmTrBkgVstMealPlanDailyDao;
        this.ocmTrBkgVstRateDailyDao = ocmTrBkgVstRateDailyDao;
        this.ocmTrBkgVstRevDailyDao = ocmTrBkgVstRevDailyDao;
        this.ocmTrBkgVstSplServiceDailyDao = ocmTrBkgVstSplServiceDailyDao;
        this.frmRateDailyBookingDao = frmRateDailyBookingDao;
        this.frmMealPlanDetailDao = frmMealPlanDetailDao;
    }

    public void doInserOtherTableForPropagation(String timeZone, LoginDetails loginDetails, PropagationData propagationData) {

        Date busDate;
        Date cusmDate;
        Integer paxAd = 0;
        Integer paxCh = 0;
        Integer paxYt = 0;
        Date fromDate = new Date(Long.parseLong(propagationData.getArrivalDate().toString()));
        Date toDate = new Date(Long.parseLong(propagationData.getDepartureDate().toString()));
        Calendar calendar = Calendar.getInstance();
        Calendar calendarNext = Calendar.getInstance();
        int resvGuid = propagationData.getResvGUid();
        int bkgUid = propagationData.getBkgUid();

        String operationCurCode = "";

        HttpClient client = HttpClients.custom().build();
        HttpUriRequest request = RequestBuilder.get()
                .setUri("/sso/saomas/orgUnit/getOprCurCode")
                .setHeader(HttpHeaders.CONTENT_TYPE, "application/json")
                .setHeader("accessToken", loginDetails.getAccessToken())
                .build();

        try {
            HttpResponse httpResponse = client.execute(request);
            HttpEntity httpEntity = httpResponse.getEntity();
            InputStream inputStream = httpEntity.getContent();
            operationCurCode = new BufferedReader(new InputStreamReader(inputStream)).readLine();
        } catch (ClientProtocolException ignored){
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int day = 0; daysBetween(fromDate, toDate) > day; day++) {

            calendar.setTime(fromDate);
            calendar.add(Calendar.DATE, day);
            busDate = calendar.getTime();

            calendarNext.setTime(busDate);
            calendarNext.add(Calendar.DATE, 1);
            cusmDate = calendarNext.getTime();

            OcmTrBkgVstMealPlanDaily ocmTrBkgVstMealPlanDaily = new OcmTrBkgVstMealPlanDaily();

            ocmTrBkgVstMealPlanDaily.setUnitCode(loginDetails.getUnitCode());
            ocmTrBkgVstMealPlanDaily.setResvGUid(resvGuid);
            ocmTrBkgVstMealPlanDaily.setBkgUid(bkgUid);
            ocmTrBkgVstMealPlanDaily.setInHouseUid(null);
            ocmTrBkgVstMealPlanDaily.setMealPlanCode(propagationData.getMealPlanCode());
            ocmTrBkgVstMealPlanDaily.setBusDate(busDate);
            ocmTrBkgVstMealPlanDaily.setCusmDate(cusmDate);
            ocmTrBkgVstMealPlanDaily.setCurCode(propagationData.getCurCode());
            ocmTrBkgVstMealPlanDaily.setPaxAd(propagationData.getPaxAd());
            ocmTrBkgVstMealPlanDaily.setPaxYt(propagationData.getPaxYt());
            ocmTrBkgVstMealPlanDaily.setPaxCh(propagationData.getPaxCh());
            ocmTrBkgVstMealPlanDaily.setPaxExAd(0);
            ocmTrBkgVstMealPlanDaily.setPaxExCh(0);
            ocmTrBkgVstMealPlanDaily.setPaxExYt(0);
            ocmTrBkgVstMealPlanDaily.setCrDatetime(createdDateTime(timeZone));
            ocmTrBkgVstMealPlanDaily.setCrUserUid(loginDetails.getUserId());
            ocmTrBkgVstMealPlanDaily.setCrSessionId(loginDetails.getSessionId());

            ocmTrBkgVstMealPlanDailyDao.save(ocmTrBkgVstMealPlanDaily);

            if(propagationData.getSplSrvType() != null) {
                OcmTrBkgVstSplServiceDaily ocmTrBkgVstSplServiceDaily = new OcmTrBkgVstSplServiceDaily();

                ocmTrBkgVstSplServiceDaily.setUnitCode(loginDetails.getUnitCode());
                ocmTrBkgVstSplServiceDaily.setResvGUid(resvGuid);
                ocmTrBkgVstSplServiceDaily.setBkgUid(bkgUid);
                ocmTrBkgVstSplServiceDaily.setInHouseUid(null);
                ocmTrBkgVstSplServiceDaily.setBusDate(busDate);
                ocmTrBkgVstSplServiceDaily.setSplSrvType(propagationData.getSplSrvType());
                ocmTrBkgVstSplServiceDaily.setCurCode(propagationData.getCurCode());
                ocmTrBkgVstSplServiceDaily.setPaxAdCount(propagationData.getPaxAd());
                ocmTrBkgVstSplServiceDaily.setPaxYtCount(propagationData.getPaxYt());
                ocmTrBkgVstSplServiceDaily.setPaxChCount(propagationData.getPaxCh());
                ocmTrBkgVstSplServiceDaily.setPaxExChCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxExAdCount(0);
                ocmTrBkgVstSplServiceDaily.setPaxExYtCount(0);
                ocmTrBkgVstSplServiceDaily.setCrDatetime(createdDateTime(timeZone));
                ocmTrBkgVstSplServiceDaily.setCrUserUid(loginDetails.getUserId());
                ocmTrBkgVstSplServiceDaily.setCrSessionId(loginDetails.getSessionId());

                ocmTrBkgVstSplServiceDailyDao.save(ocmTrBkgVstSplServiceDaily);
            }

            if(propagationData.getMealPlanCode() != null) {
                OcmTrBkgVstRateDaily ocmTrBkgVstRateDaily = new OcmTrBkgVstRateDaily();

                ocmTrBkgVstRateDaily.setUnitCode(loginDetails.getUnitCode());
                ocmTrBkgVstRateDaily.setResvGUid(resvGuid);
                ocmTrBkgVstRateDaily.setBkgUid(bkgUid);
                ocmTrBkgVstRateDaily.setInHouseUid(null);
                ocmTrBkgVstRateDaily.setMealPlanCode(propagationData.getMealPlanCode());
                ocmTrBkgVstRateDaily.setBusDate(busDate);
                ocmTrBkgVstRateDaily.setSplSrvType(propagationData.getSplSrvType());
                ocmTrBkgVstRateDaily.setOccInd(propagationData.getOccInd());
                ocmTrBkgVstRateDaily.setRoomRate(propagationData.getRoomRate());
                ocmTrBkgVstRateDaily.setCurCode(propagationData.getCurCode());
                ocmTrBkgVstRateDaily.setRateCode(propagationData.getRateCode());
                ocmTrBkgVstRateDaily.setOccInd(propagationData.getOccInd());
                ocmTrBkgVstRateDaily.setCrDatetime(createdDateTime(timeZone));
                ocmTrBkgVstRateDaily.setCrUserUid(loginDetails.getUserId());
                ocmTrBkgVstRateDaily.setCrSessionId(loginDetails.getSessionId());

                ocmTrBkgVstRateDailyDao.save(ocmTrBkgVstRateDaily);
            }

            try {

                float total = 0;
                Date finalBusDate = busDate;

                String revPayCode = frmRateDailyBookingDao.getFirstByBusDate(busDate).getRevpayCode();
                List<OcmTrBkgVstMealPlanDaily> mealPlanDailyData = ocmTrBkgVstMealPlanDailyDao.
                        getFirstByMealPlanCodeAndUnitCodeAndCurCode(propagationData.getMealPlanCode(),
                                loginDetails.getUnitCode(), propagationData.getCurCode());
                List<FrmMealPlanDetail> data = frmMealPlanDetailDao.
                        getFirstByUnitCodeAndMealPlanCodeAndRevpayCodeAndCurCode(loginDetails.getUnitCode(),
                                propagationData.getMealPlanCode(), revPayCode,
                                propagationData.getCurCode());

                for(int l=0; mealPlanDailyData.size() > l; l++) {
                    if(new SimpleDateFormat("yyyy-MM-dd").format(mealPlanDailyData.get(l).getBusDate())
                            .equals(new SimpleDateFormat("yyyy-MM-dd")
                            .format(finalBusDate))) {
                        paxAd = mealPlanDailyData.get(l).getPaxAd();
                        paxCh = mealPlanDailyData.get(l).getPaxCh();
                        paxYt = mealPlanDailyData.get(l).getPaxYt();

                        for(int j=0; data.size() > j; j++) {
                            if(data.get(j).getPaxType().equals("ad")) {
                                total += paxAd * data.get(j).getMealRate();
                            } else if(data.get(j).getPaxType().equals("ch")) {
                                total += paxCh * data.get(j).getMealRate();
                            } else {
                                total += paxYt * data.get(j).getMealRate();
                            }
                        }
                    }
                }

                OcmTrBkgVstRevDaily ocmTrBkgVstRevDaily = new OcmTrBkgVstRevDaily();
                ocmTrBkgVstRevDaily.setUnitCode(loginDetails.getUnitCode());
                ocmTrBkgVstRevDaily.setBkgUid(bkgUid);
                ocmTrBkgVstRevDaily.setResvGUid(resvGuid);
                ocmTrBkgVstRevDaily.setBusDate(busDate);
                ocmTrBkgVstRevDaily.setCurCode(propagationData.getCurCode());
                ocmTrBkgVstRevDaily.setOprCurCode(operationCurCode);
                ocmTrBkgVstRevDaily.setFxOprCur(propagationData.getFxOprCur());
                ocmTrBkgVstRevDaily.setRoe(propagationData.getRoe());
                ocmTrBkgVstRevDaily.setRevpayCode(revPayCode);
                ocmTrBkgVstRevDaily.setDayRateGross(total);
                ocmTrBkgVstRevDaily.setDayRateNet(propagationData.getRateNet());
                ocmTrBkgVstRevDaily.setUnitQty(propagationData.getUnitQnt());
                ocmTrBkgVstRevDaily.setMealPlanCode(propagationData.getMealPlanCode());
                ocmTrBkgVstRevDaily.setMealPlanInclusive("N");
                ocmTrBkgVstRevDaily.setSplSrvType(propagationData.getSplSrvType());
                ocmTrBkgVstRevDaily.setSplSrvInclusive("N");
                ocmTrBkgVstRevDaily.setOccInd(propagationData.getOccInd());
                ocmTrBkgVstRevDaily.setCrDatetime(createdDateTime(timeZone));
                ocmTrBkgVstRevDaily.setCrUserUid(loginDetails.getUserId());
                ocmTrBkgVstRevDaily.setCrSessionId(loginDetails.getSessionId());

                ocmTrBkgVstRevDailyDao.save(ocmTrBkgVstRevDaily);
            } catch (NullPointerException npe) {
                System.out.println("Data not found ... ");
            }
        }
    }

    private static long daysBetween(Date one, Date two) {

        long difference = (one.getTime() - two.getTime()) / 86400000;
        return Math.abs(difference);
    }

    private LocalDateTime createdDateTime(String loggedInTimeZone) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(loggedInTimeZone));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.from(LocalDateTime.parse(df.format(date), formatter));
        return dateTime;
    }
}
