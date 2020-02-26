package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomTypeAvailable.TrOcmRoomTypeAvalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TrOcmRoomRoomTypeAvalDao extends JpaRepository<TrOcmRoomTypeAvalEntity, Long> {

    @Modifying
    @Query(value = "update tr_ocm_room_type_aval set aval_count = ?1 where unit_code = ?2 and bus_date = ?3 and " +
            "occ_rm_type = ?4", nativeQuery = true)
    void updateRoomTypeAvail(int count, String unitCode, String busDate, String roomType);

    TrOcmRoomTypeAvalEntity getFirstByUnitCodeAndOccRmTypeAndBusDate(String unitCode, String roomType, Date busDate);
}
