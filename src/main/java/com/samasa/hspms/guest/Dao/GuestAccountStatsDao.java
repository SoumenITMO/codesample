package com.samasa.hspms.guest.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.samasa.hspms.guest.Entity.GuestAccountStats;
import com.samasa.hspms.guest.Entity.GuestAccountStatsId;

public interface GuestAccountStatsDao extends JpaRepository<GuestAccountStats, GuestAccountStatsId> {
		
	//List<GuestAccountContacts> findByIdUnitCode(String unitCode);
		
}
