package com.lti.dao;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Income;

@Repository
@Scope("singleton")  // By default spring objects are singleton.
@Transactional(propagation=Propagation.REQUIRED)
public class IncomeDaoImpl implements IncomeDao{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Income insertIncomeDetails(Income income) {

		
			System.out.println("Income" + income);
			manager.persist(income);
			return manager.find(Income.class, income.getIncomeId());
		
	}

}
