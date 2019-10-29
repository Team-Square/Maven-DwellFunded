package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Property;

@Repository
@Scope("singleton")  // By default spring objects are singleton.
@Transactional(propagation=Propagation.REQUIRED)
public class PropertyDaoImpl implements PropertyDao{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Property insertPropertyDetails(Property property) {
		System.out.println("Income"+property);
		manager.persist(property);
		return manager.find(Property.class, property.getPropertyId());
		//return income;
	}

}
