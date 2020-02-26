package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomTypeAvailable.TrOcmRoomTypeAvalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;

public interface RoomTypeAvailableDao extends JpaRepository<TrOcmRoomTypeAvalEntity, Long> {

    TrOcmRoomTypeAvalEntity getFirstByBusDateAndOccRmTypeAndUnitCode(Date busDate, String occRmType, String unitCode);

    TrOcmRoomTypeAvalEntity getFirstByBusDate(Date busDate);

    TrOcmRoomTypeAvalEntity getFirstByUnitCodeAndBusDate(String unitCode, Date busDate);

    TrOcmRoomTypeAvalEntity getFirstByBusDateAndUnitCode(Date busDate, String unitCode);
}
