package com.samasa.hspms.common.dao;

import java.util.List;

public interface GenericDao<E,K> {
	
	public K save(E entity);
	public void update(E entity);
	public void merge(E entity);
	List<E> findAll();
	List<E> getOrderByRecords(String orderColumnName);
	E findById(K key);
	public void delete(K key);
	List<E> getActiveRecords();
	List<E> getActiveRecords(String activeColumnName);
	void remove(K key);
	
}
