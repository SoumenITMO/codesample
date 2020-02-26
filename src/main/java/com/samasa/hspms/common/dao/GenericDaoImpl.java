package com.samasa.hspms.common.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.samasa.hspms.AppConstants;




@Repository
@SuppressWarnings("unchecked")
public abstract class GenericDaoImpl<E,K extends Serializable> implements GenericDao<E,K> {

	@Autowired
	private SessionFactory sessionFactory;
	
	public final Class<E> entityClass;

	public GenericDaoImpl() {
		this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	public K save(E entity) {
		return (K) getSession().save(entity);
	}

	public void update(E entity) {
		getSession().update(entity);
	}
	
	public void merge(E entity) {
		getSession().merge(entity);
	}

	public List<E> findAll() {
		
		CriteriaQuery<E> criteriaQuery = getSession().getCriteriaBuilder().createQuery(entityClass);
        criteriaQuery.from(entityClass);

        return getSession().createQuery(criteriaQuery).getResultList();
	
	}
	
	public List<E> getOrderByRecords(String orderColumnName) {
		return null;
	}

	public E findById(K key) {
		return (E) getSession().get(entityClass, key);
	}
	
	public void delete(K key){
		E entity = findById( key );
		getSession().delete( entity );
	}
	
	public void remove(K key){
		E entity = findById( key );
		getSession().remove( entity );
	}

	public List<E> getActiveRecords() {
		return getActiveRecords("status");
	}
	
	public List<E> getActiveRecords(String activeColumnName) {
		
		CriteriaBuilder cb = getSession().getCriteriaBuilder();
		
		CriteriaQuery<E> criteriaQuery = getSession().getCriteriaBuilder().createQuery(entityClass);
        Root<E> root = criteriaQuery.from(entityClass);
        criteriaQuery.select(root);
         
     
        criteriaQuery.select(root).where(cb.equal(root.get(activeColumnName), AppConstants.ACTIVESTATUS));
        return getSession().createQuery(criteriaQuery).getResultList();
       
	}
}
