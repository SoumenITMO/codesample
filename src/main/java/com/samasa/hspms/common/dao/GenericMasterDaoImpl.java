package com.samasa.hspms.common.dao;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samasa.hspms.common.service.SortOn;




@Repository
@SuppressWarnings("unchecked")
public class GenericMasterDaoImpl<T,ID extends Serializable> implements IGenericMasterDao<T,ID> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Class<T> entityClass;
	
	List<Order> orderList = new ArrayList<>();


	public GenericMasterDaoImpl() {
		
	}
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	

	@Override
	public T save(T entity) {
		return (T) getSession().save(entity);
	}

	@Override
	public void update(T entity) {
		getSession().update(entity);
		
	}

	@Override
	public void merge(T entity) {
		getSession().merge(entity);
		
	}

	@Override
	public boolean existsById(Class entityClass,ID key) {
		return  getSession().get(entityClass, key) != null?true:false;
	}

	@Override
	public List<?> findByIdUnitCodeAndStatusInOrderBy(Class entityClass, String unitCode, List<String> status) {
	
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		
		CriteriaQuery<T> criteriaQuery = getSession().getCriteriaBuilder().createQuery(entityClass);
        Root<T> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root);
        
        getFieldNames(entityClass,cb,root);
     
        Predicate unit = cb.equal(root.get("id").get("unitCode"), unitCode);
        
        criteriaQuery.where(cb.and(unit,root.get("status").in(status)));
       if(!orderList.isEmpty())
        	criteriaQuery.orderBy(orderList);
        List<T> list = (List<T>) getSession().createQuery(criteriaQuery).getResultList();
        return list;
	}

	@Override
	public List<?> getExistingKeys(Class entityClass, String projectCoulumn, String unitCode) {
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		
		CriteriaQuery<T> criteriaQuery = getSession().getCriteriaBuilder().createQuery(entityClass);
        Root<T> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root);
     
        Predicate unit = cb.equal(root.get("id").<String>get("unitCode"), unitCode);
        criteriaQuery.select(root.get("id").get(projectCoulumn)).where(cb.and(unit));

        return getSession().createQuery(criteriaQuery).getResultList();
	}
	
	
	private void getFieldNames(Class entityClass,CriteriaBuilder cb,Root<T> root) {
		orderList = new ArrayList<>();
		for(Field field : entityClass.getDeclaredFields()){
			if (field.isAnnotationPresent(SortOn.class)) {
				  if(field.getAnnotation(SortOn.class).by().equals("asc"))
					  orderList.add(cb.asc(root.get(field.getName())));
				  else
					  orderList.add(cb.desc(root.get(field.getName())));
			 }
		}
	}

}
