package com.samasa.hspms.common.service;

import org.springframework.stereotype.Service;

import com.samasa.hspms.common.dto.ActivityLog;
import com.samasa.hspms.common.dto.LoginDetails;

@Service
public interface ActivityLogService {
	
	public void saveLog(ActivityLog activityLog,LoginDetails loginDetails); 
	public ActivityLog getLog();

}
