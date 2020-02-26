package com.samasa.hspms.Booking.validation.Services.RoomBookingService;

import com.samasa.hspms.Booking.validation.Dao.OcmTrBkgHdrDao;
import com.samasa.hspms.Booking.validation.Dto.Propagation.PropagationData;
import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrBkgHdr;
import com.samasa.hspms.Booking.validation.Services.PropagationService.PropagationDataInsert;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class Propagation {

    private OcmTrBkgHdrDao ocmTrBkgHdrDao;
    private PropagationDataInsert propagationDataInsert;
    private RoomBookingOtherTablesDataDelete roomBookingOtherTablesDataDelete;

    public Propagation(OcmTrBkgHdrDao ocmTrBkgHdrDao,
                       PropagationDataInsert propagationDataInsert,
                       RoomBookingOtherTablesDataDelete roomBookingOtherTablesDataDelete) {
        this.ocmTrBkgHdrDao = ocmTrBkgHdrDao;
        this.propagationDataInsert = propagationDataInsert;
        this.roomBookingOtherTablesDataDelete = roomBookingOtherTablesDataDelete;
    }

    public boolean doPropagation(String timeZone, LoginDetails loginDetails, PropagationData propagation) {

        boolean propagationDone = false;

        OcmTrBkgHdr ocmTrBkgHdr = ocmTrBkgHdrDao.getFirstByUnitCodeAndBkgUid(loginDetails.getUnitCode(),
                propagation.getBkgUid());
        if(ocmTrBkgHdr != null) {
            if(ocmTrBkgHdr.getResvPropagation().equals("N")) {
                roomBookingOtherTablesDataDelete.deleteOtherTables( propagation.getBkgUid());
                if(ocmTrBkgHdr.getOccStautsId().equals("CX")) {
                    ocmTrBkgHdrDao.updateBkngHdr( propagation.getBkgUid());
                    propagationDone = true;
                } else {
                    propagationDataInsert.doInserOtherTableForPropagation(timeZone, loginDetails, propagation);
                    ocmTrBkgHdrDao.updateBkngHdr( propagation.getBkgUid());
                }
            }
        }
        return propagationDone;
    }
}
