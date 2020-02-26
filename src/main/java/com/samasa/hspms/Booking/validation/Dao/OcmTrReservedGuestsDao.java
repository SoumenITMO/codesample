package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.RoomBooking.OcmTrListReservedGuest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;

public interface OcmTrReservedGuestsDao extends JpaRepository<OcmTrListReservedGuest, Long> {
    List<OcmTrListReservedGuest> getAllByUnitCode(String unitCode);

    @Query(value = "select * from ocm_tr_list_reserved_guest where unit_code = ?1 and (indv_confirm_number = ?2 " +
            "or bkg_blk_range_id = ?3 or group_uid = ?4 or rate_code = ?5 or primary_ind = ?6 or " +
            "shares_with_guest_uid = ?7 or arr_pick_req = ?8 or is_checked_in = ?9 or is_checked_out = ?10 or room_no = ?11)", nativeQuery = true)
    List<OcmTrListReservedGuest> searchGuestList(String unitCode, Integer indvConfNo, Integer bkgBlkRangeId,
                                                 Integer groupId, String rateCode, char primaryInd, Integer shareWithGUid,
                                                 char arrPickReq, char isCheckedIn, char isCheckOut, String roomNumber);

    @Query(value = "SELECT * FROM `ocm_tr_list_reserved_guest` ORDER BY resv_g_uid DESC Limit 1", nativeQuery = true)
    OcmTrListReservedGuest getLastEntry();

    @Modifying
    @Query(value = "update ocm_tr_list_reserved_guest set arr_date = ?2, dep_date = ?3, cur_code = ?4, room_no = ?5, " +
            "occ_ind = ?6, upgraded_room_rate = ?7 where bkg_nbr = ?1", nativeQuery = true)
    void updateGuestReservedDataForNewBooking(String bkgHdr, Date arrDate, Date deptDate, String curCode, String roomNumber,
                                              String occInd, float upgratedRoomRate);
}
