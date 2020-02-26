package com.samasa.hspms.Booking.validation.Services.RoomBookingService;

import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstMealPlanDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstRateDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstRevDailyDao;
import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgVstSplServiceDailyDao;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class RoomBookingOtherTablesDataDelete {

    private OcmTrBkgVstMealPlanDailyDao ocmTrBkgVstMealPlanDailyDao;
    private OcmTrBkgVstRateDailyDao ocmTrBkgVstRateDailyDao;
    private OcmTrBkgVstRevDailyDao ocmTrBkgVstRevDailyDao;
    private OcmTrBkgVstSplServiceDailyDao ocmTrBkgVstSplServiceDailyDao;

    public RoomBookingOtherTablesDataDelete(OcmTrBkgVstMealPlanDailyDao ocmTrBkgVstMealPlanDailyDao,
                                            OcmTrBkgVstRateDailyDao ocmTrBkgVstRateDailyDao,
                                            OcmTrBkgVstRevDailyDao ocmTrBkgVstRevDailyDao,
                                            OcmTrBkgVstSplServiceDailyDao ocmTrBkgVstSplServiceDailyDao) {
        this.ocmTrBkgVstMealPlanDailyDao = ocmTrBkgVstMealPlanDailyDao;
        this.ocmTrBkgVstRateDailyDao = ocmTrBkgVstRateDailyDao;
        this.ocmTrBkgVstRevDailyDao = ocmTrBkgVstRevDailyDao;
        this.ocmTrBkgVstSplServiceDailyDao = ocmTrBkgVstSplServiceDailyDao;
    }

    public void deleteOtherTables(Integer bkgUId) {
        ocmTrBkgVstMealPlanDailyDao.deleteBkgVstMealPlanDailyData(bkgUId);
        ocmTrBkgVstRateDailyDao.deleteBkgRateDailyData(bkgUId);
        ocmTrBkgVstRevDailyDao.deleteBkgRevDaily(bkgUId);
        ocmTrBkgVstSplServiceDailyDao.deleteBkgSplServiceDaily(bkgUId);
    }
}
