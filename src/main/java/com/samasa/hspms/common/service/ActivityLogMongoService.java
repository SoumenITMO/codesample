package com.samasa.hspms.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samasa.hspms.common.dao.ActivityLogRepository;
import com.samasa.hspms.common.dto.ActivityLog;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.util.Utc;

@Service
public class ActivityLogMongoService implements ActivityLogService{

	@Autowired
	ActivityLogRepository repository;
	
	public void saveLog(ActivityLog activityLog,LoginDetails loginDetails) {
		
		activityLog.setCrUserUid(loginDetails.getUserId());
		activityLog.setCrDatetime(Utc.getUtcDateTime());
		activityLog.setCrSessionId(loginDetails.getSessionId());
		repository.save(activityLog);
		
	}

	public ActivityLog getLog() {
		// TODO Auto-generated method stub
		return null;
	}


}
