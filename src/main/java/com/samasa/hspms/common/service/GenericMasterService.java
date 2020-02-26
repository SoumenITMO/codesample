package com.samasa.hspms.common.service;

import static com.samasa.hspms.AppConstants.*;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.samasa.hspms.common.dao.IGenericMasterDao;
import com.samasa.hspms.common.dto.ActivityLog;
import com.samasa.hspms.common.dto.LoginDetails;
import com.samasa.hspms.common.dto.RespEntity;
import com.samasa.hspms.common.dto.UnitMasterList;
import com.samasa.hspms.util.Utc;

public abstract class GenericMasterService<T,ID extends Serializable,D> implements IGenericMasterService<T,ID,D> {

	@Autowired
	IGenericMasterDao<T,ID> masterDao;
	
	public final Class<T> entityClass;

	
	@SuppressWarnings("unchecked")
	public GenericMasterService(){
		this.entityClass = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	public abstract ModelMapper dtoToEntity();
	public abstract ModelMapper entityToDto();
	
	@Transactional
	@Override
	public RespEntity<?> saveUpdate(ActivityLog activityLog, LoginDetails loginDetails, UnitMasterList<D> masterObj) throws Exception{
		List<D> dtoList = masterObj.getMasterDetails();
		List<String> units = masterObj.getSelUnits();

		for(String unitCode : units) {

			for(D masterDto :dtoList) {

				T entity = this.dtoToEntity().map(masterDto,entityClass);
				
				Field getIDF = entity.getClass().getDeclaredField("id");
				getIDF.setAccessible(true);
				
				Object objectValue = getIDF.get(entity);
				
				Field unitCodeF = objectValue.getClass().getDeclaredField("unitCode");
				unitCodeF.setAccessible(true);
				unitCodeF.set(objectValue, unitCode);
			
				getIDF.set(entity, objectValue);
				
				@SuppressWarnings("unchecked")
				boolean isMasterExist = masterDao.existsById(entityClass,(ID) getIDF.get(entity));
				
				Field mfdDateTimeF = entity.getClass().getDeclaredField("mfdDatetime");
				mfdDateTimeF.setAccessible(true);
				
				Field mfdUserIdF = entity.getClass().getDeclaredField("mfdUserUid");
				mfdUserIdF.setAccessible(true);
				
				Field mfdSessionIdF = entity.getClass().getDeclaredField("mfdSessionId");
				mfdSessionIdF.setAccessible(true);
				
				Field statusIdF = entity.getClass().getDeclaredField("status");
				statusIdF.setAccessible(true);
				
				
				if(isMasterExist&&(loginDetails.getMethod().equals("PUT")||loginDetails.getMethod().equals("DELETE"))) {
					mfdDateTimeF.set(entity, Utc.getUtcDateTime());
					mfdUserIdF.set(entity, loginDetails.getUserId());
					mfdSessionIdF.set(entity, loginDetails.getSessionId());

					if(loginDetails.getMethod().equals("DELETE"))
						statusIdF.set(entity,DELETESTATUS);

					masterDao.merge(entity);

				} else if(!isMasterExist) {
					
					Field crDateTimeF = entity.getClass().getDeclaredField("crDatetime");
					crDateTimeF.setAccessible(true);
					
					Field crUserIdF = entity.getClass().getDeclaredField("crUserUid");
					crUserIdF.setAccessible(true);
					
					Field crSessionIdF = entity.getClass().getDeclaredField("crSessionId");
					crSessionIdF.setAccessible(true);
					
					statusIdF.set(entity,ACTIVESTATUS);
					crDateTimeF.set(entity,Utc.getUtcDateTime());
					crSessionIdF.set(entity,loginDetails.getSessionId());
					crUserIdF.set(entity,loginDetails.getUserId());
					mfdDateTimeF.set(entity, null);
					mfdUserIdF.set(entity, null);
					mfdSessionIdF.set(entity, null);
					
					masterDao.save(entity);
				}

			}

		}

		return new RespEntity<>(RES_SUCCESS,"SUCCESS");
	}


	@Override
	@Transactional
	public RespEntity<?> isExist(ID id,List<String> units) throws Exception {
		for(String unit : units) {
			Field unitCodeF = id.getClass().getDeclaredField("unitCode");
			unitCodeF.setAccessible(true);
			unitCodeF.set(id, unit);
			
			if(!masterDao.existsById(entityClass,id)) {
				return new RespEntity<>(RES_SUCCESS,"");
			}	
		}
		return new RespEntity<>(RES_SUCCESS_201,"");
	}


	@Override
	@Transactional
    public RespEntity<?> getMaster(LoginDetails loginDetails, String unitCode, Type listType) {

		return new RespEntity<>(RES_SUCCESS,this.entityToDto().map(masterDao.findByIdUnitCodeAndStatusInOrderBy(entityClass,unitCode,new ArrayList<String>(Arrays.asList(ACTIVESTATUS, INACTIVESTATUS)))
				, listType));
	}
	
	@Override
	@Transactional
	public List<?> getExistingKeys(String projectCoulumn, String unit) {
		return masterDao.getExistingKeys(entityClass,projectCoulumn,unit);
	}
	
	@Override
	@Transactional
	public RespEntity<?> getMasterByStatus(LoginDetails loginDetails, List<String> status, Type listType) {
		return new RespEntity<>(RES_SUCCESS,this.entityToDto().map(masterDao.findByIdUnitCodeAndStatusInOrderBy(entityClass,loginDetails.getUnitCode(),status)
				, listType));
	}

}
