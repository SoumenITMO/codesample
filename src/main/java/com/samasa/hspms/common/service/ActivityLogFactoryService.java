package com.samasa.hspms.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivityLogFactoryService {
	
	@Autowired
	ActivityLogService activityLogRDBMSService;
	
	@Autowired
	ActivityLogService activityLogMongoService;
	
	public ActivityLogService getActivityLogService(String serviceType) {
		
		if(serviceType.equals("MONGODB"))
			return activityLogMongoService;
		else if (serviceType.equals("RDBMS")) 
			return activityLogRDBMSService;
		else	
			return null;
		
	}

}
