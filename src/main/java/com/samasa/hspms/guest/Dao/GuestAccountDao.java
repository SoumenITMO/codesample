package com.samasa.hspms.guest.Dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.samasa.hspms.guest.Entity.GuestAccount;
import org.springframework.data.jpa.repository.Query;

public interface GuestAccountDao extends JpaRepository<GuestAccount, Long> {
		
	List<GuestAccount> findByUnitCode(String unitCode);
	GuestAccount getFirstByUnitCodeAndGuestUid(String unitCode, Integer guestUid);
	List<GuestAccount> findAllByFirstNameContaining(String guestName);
	List<GuestAccount> findAllByLastNameContaining(String guestName);

	@Query(value = "select * from guest_account where (first_name Like ?1%) or last_name Like ?1%", nativeQuery = true)
	List<GuestAccount> findByName(String guestName);

	List<GuestAccount> getAllByUnitCodeAndGuestUid(String unitCode, Integer guestUid);
}
