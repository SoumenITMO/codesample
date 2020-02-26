package com.samasa.hspms.common.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samasa.hspms.common.dao.ActivityLogDetailsDao;
import com.samasa.hspms.common.dao.ActivityLogHeaderDao;
import com.samasa.hspms.common.dto.ActivityLog;
import com.samasa.hspms.common.dto.ActivityLogDtls;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.entity.BpmLogDetail;
import com.samasa.hspms.common.entity.BpmLogHeader;
import com.samasa.hspms.util.Utc;

@Service
public class ActivityLogRDBMSService implements ActivityLogService{
	
	@Autowired
	ActivityLogHeaderDao activityLogHeaderDao;
	
	@Autowired
	ActivityLogDetailsDao activityLogDetailsDao;

	@Transactional
	public void saveLog(ActivityLog activityLog,LoginDetails loginDetails) {
		
		Integer seqnoId = activityLogHeaderDao.save(new BpmLogHeader(activityLog.getProductCode(),
				activityLog.getModuleCode(),activityLog.getFormCode(),
				Utc.getUtcDateTime(),loginDetails.getUserId(),loginDetails.getSessionId()));
		
		for(ActivityLogDtls activityLogDtls : activityLog.getApplicationLogDtls()) {
	
	
			
			BpmLogHeader bpmLogHeader = new BpmLogHeader();
			bpmLogHeader.setSeqnoId(seqnoId);
			
			activityLogDetailsDao.save(new BpmLogDetail(bpmLogHeader, 
										activityLogDtls.getReferenceId(),
										activityLogDtls.getFieldCode(),
										activityLog.getFormCode(),
										activityLog.getProductCode(),
										activityLog.getModuleCode(),
										activityLogDtls.getOldValue(), 
										activityLogDtls.getNewValue(), 
										activityLogDtls.getActivityType(), 
										loginDetails.getUserId(), 
										Utc.getUtcDateTime(), 
										loginDetails.getSessionId()));
		}
		
	}

	public ActivityLog getLog() {
		// TODO Auto-generated method stub
		return null;
	}

}
