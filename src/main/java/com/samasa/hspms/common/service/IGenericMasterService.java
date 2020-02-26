package com.samasa.hspms.common.service;

import java.lang.reflect.Type;
import java.util.List;

import com.samasa.hspms.common.dto.ActivityLog;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import com.samasa.hspms.common.dto.UnitMasterList;

public interface IGenericMasterService<T,ID,D> {
	
	RespEntity<?> saveUpdate(ActivityLog activityLog, LoginDetails loginDetails, UnitMasterList<D> masterObj)throws Exception;
	RespEntity<?> isExist(ID id,List<String> units)throws Exception;
	RespEntity<?> getMaster(LoginDetails loginDetails, String unitCode,Type listType);
	List<?> getExistingKeys(String projectCoulumn, String unit);
	RespEntity<?> getMasterByStatus(LoginDetails loginDetails, List<String> status, Type listType);

}
