package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomTypeNoAvailable.TrOcmRoomNoAvalRoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrOcmRoomAvailDao extends JpaRepository<TrOcmRoomNoAvalRoomType, Long> {
}
