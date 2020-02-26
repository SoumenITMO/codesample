package com.samasa.hspms.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.samasa.hspms.AppConstants;
import com.samasa.hspms.common.dto.ActivityLog;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import com.samasa.hspms.common.service.ActivityLogFactoryService;
import com.samasa.hspms.common.service.ActivityLogService;



@Aspect
@Configuration
public class LogginAspect {
	
	@Value("${activity_log_stroage}")
	private String activityServiceType;
	
	@Autowired
	ActivityLogFactoryService activityLogFactoryService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.samasa.hsfsm..*.*(..))")
	public void logInfo(JoinPoint joinPoint){
		
		LOGGER.info("Execution --->> {}", joinPoint);
	}
	
	@AfterReturning(pointcut="execution(* com.samasa.hspms..*.*(..)) && args(activityLog,loginDetails,..)",returning="retVal")
	public void applicationLogger(JoinPoint joinPoint, final ActivityLog activityLog, final LoginDetails loginDetails, RespEntity<?> retVal){
		
		if(activityLog!=null) {
			if(retVal.getStatus() == AppConstants.RES_SUCCESS && activityLog.getFormCode() != null) {
				new Thread(new Runnable() {	
					public void run() {
						try {
							ActivityLogService activityLogService =  activityLogFactoryService.getActivityLogService(activityServiceType);
							activityLogService.saveLog(activityLog,loginDetails);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}).start();
			}
		}
	

	}
	
	@AfterThrowing(pointcut = "execution(* com.samasa.hspms..*.*(..))", throwing = "ex")
	public void logError(JoinPoint joinPoint,Exception ex) {
	
		LOGGER.error("ERROR ---->> "+joinPoint+" --->>", ex);
	
	}

}
