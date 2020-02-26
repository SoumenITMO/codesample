package com.samasa.hspms.Booking.validation.Dao;

import com.samasa.hspms.Booking.validation.Entity.Corta.CortaAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CortaDao extends JpaRepository<CortaAccount, Long> {

    Optional<CortaAccount> getFirstByCortaUidAndUnitCode(Integer cortaUid, String unitCode);
}
