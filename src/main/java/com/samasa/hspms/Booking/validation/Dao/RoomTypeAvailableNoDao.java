package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomTypeNoAvailable.TrOcmRoomNoAvalRoomType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Date;

@Repository
public interface RoomTypeAvailableNoDao extends JpaRepository<TrOcmRoomNoAvalRoomType, Long> {

    TrOcmRoomNoAvalRoomType getFirstByBusDateAndRoomNoAndUnitCode(Date busDate, String roomNo,
                                                                                   String unitCode);

    @Modifying
    @Query(value = "update tr_ocm_room_no_aval set room_stauts_id = 'BK' where bus_date = ?1 and unit_code = ?2 " +
            "and room_no = ?3", nativeQuery = true)
    void updateRoomNoAvailForBooking(String busDate, String unitCode, String roomNo);

    @Modifying
    @Query(value = "update tr_ocm_room_no_aval set room_stauts_id = 'VA' where bus_date = ?1 and unit_code = ?2 " +
            "and room_no = ?3", nativeQuery = true)
    void updateRoomNoAvailForCancelBooking(Date busDate, String unitCode, String roomNo);
}
