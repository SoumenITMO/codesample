package com.samasa.hspms.aop;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.samasa.hspms.AppConstants;
import com.samasa.hspms.common.dto.RespEntity;


@RestControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler(value = { Exception.class })
	public RespEntity<?> unknownException(Exception ex) {
		//LOG.error(ex.getCause().toString());
		ex.printStackTrace();
		return new RespEntity<String>(AppConstants.RES_FAIL, "Internal servcer error");
	}
	
	@ExceptionHandler(value = { DataIntegrityViolationException.class })
	public RespEntity<?> sqlException(DataIntegrityViolationException ex) {
		//LOG.error(ex.getCause().toString());
		ex.printStackTrace();
		return new RespEntity<String>(AppConstants.RES_FAIL, ex.getLocalizedMessage());
	}

}
