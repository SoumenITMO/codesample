package com.samasa.hspms.guest.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samasa.hspms.Booking.validation.Dto.MainInput.BookInputDataDto;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import com.samasa.hspms.guest.Services.GuestAccountService;


@RestController
@RequestMapping("/guest-account")

public class GuestAccountController {
	
	@Autowired
	GuestAccountService guestAccountService;
	
	@RequestMapping(value="/unitcode", method = RequestMethod.GET)
    public RespEntity<?> getCortaAccountByUnitCode(@RequestAttribute("loginDetails") LoginDetails loginDetails) throws Exception {
		
        return guestAccountService.getGuestAccByUnitCode(loginDetails);
    }
	
	@RequestMapping(method = RequestMethod.POST)
    public RespEntity<?> saveGuestAccount(@RequestBody BookInputDataDto bookInputDataDto,
    		@RequestAttribute("loginDetails") LoginDetails loginDetails) throws Exception {

        return new RespEntity<>(200, guestAccountService.saveGuestAccount(bookInputDataDto, loginDetails));
    }
	
	
	
}
