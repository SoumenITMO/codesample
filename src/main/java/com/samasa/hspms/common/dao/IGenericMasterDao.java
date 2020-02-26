package com.samasa.hspms.common.dao;

import java.util.List;

public interface IGenericMasterDao<T,ID> {
	
	public T save(T entity);
	public void update(T entity);
	public void merge(T entity);
	boolean existsById(Class entityClass,ID key);
	public List<?> findByIdUnitCodeAndStatusInOrderBy(Class entityClass,String unitCode,List<String> status);
	List<?> getExistingKeys(Class entityClass, String projectCoulumn, String unitCode);
}
