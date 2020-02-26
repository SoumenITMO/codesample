package com.samasa.hspms.Booking.validation.Services.CortaService;

import com.samasa.hspms.Booking.validation.Dao.CortaDao;
import com.samasa.hspms.Booking.validation.Dto.SubSections.Corta.CortaAccountDto;
import com.samasa.hspms.common.dto.LoginDetails;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CortaService {

    private CortaDao cortaDao;

    public CortaService(CortaDao cortaDao) {
        this.cortaDao = cortaDao;
    }

    public boolean checkCortaAccount(CortaAccountDto cortaAccountDto, LoginDetails loginDetails) {

        if (cortaAccountDto != null) {
            return cortaDao.getFirstByCortaUidAndUnitCode(cortaAccountDto.getCortaUid(), loginDetails.getUnitCode()).isPresent();
        }
        return true;
    }
}
