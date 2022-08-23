package com.solid.interfaceSegregation.service;


import com.solid.interfaceSegregation.Entity.Entity;

//common interface to be implemented by all persistence services. 
public interface PersistenceService<T extends Entity> {

	public void save(T entity);
	
	public void delete(T entity);
	
	public T findById(Long id);

// Since the below method is not used by both of the implemented classes 
// i.e OrderPersistence & UserPersistence
	
//	public List<T> findByName(String name);

	
}
