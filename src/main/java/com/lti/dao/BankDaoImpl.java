package com.lti.dao;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.annotation.SessionScope;

import com.lti.beans.Bank;
import com.lti.beans.Property;

@Repository
@Scope("singleton")  // By default spring objects are singleton.
@Transactional(propagation=Propagation.REQUIRED)
public class BankDaoImpl implements BankDao{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public Bank insertBankDetails(Bank bank) {
		manager.persist(bank);
		return manager.find(Bank.class, bank.getId());
	}

	@Override
	public Bank insertNewBankDetails(String username) {
		int maxId = (int) manager.createQuery("Select max(id) from Bank").getSingleResult();
		 //return maxId + 1;
		System.out.println(maxId);
		Bank bank = new Bank();
		int id = maxId + 1;
		bank.setBankName("DwellFunded Bank");
		bank.setAccountNo(id);
		bank.setIfscNo("DF00038");
		bank.setUserId(username);
		bank.setFormStatus(0);
		
		manager.persist(bank);
		return manager.find(Bank.class, bank.getId());
	}

	@Override
	public Bank getAccountSummary(String username) {
		Query qry = manager.createQuery("FROM Bank where userId = :username");
		qry.setParameter("username", username);
		return (Bank) qry.getSingleResult();
	}

}
