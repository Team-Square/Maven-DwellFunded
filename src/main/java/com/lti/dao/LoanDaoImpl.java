package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Bank;
import com.lti.beans.Loan;
import com.lti.beans.User;

@Repository
@Scope("singleton") // By default spring objects are singleton.
@Transactional(propagation = Propagation.REQUIRED)
public class LoanDaoImpl implements LoanDao {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public Loan insertLoanDetails(Loan loan) {
		// int maxId = (int) manager.createQuery("Select max(id) from
		// Loan").getSingleResult();
		// int loanid = maxId + 1;
		// System.out.println("Max iD is"+maxId);
		// Loan loan = new Loan();

		// loan.setLoanId(loanid);

		manager.persist(loan);
		return manager.find(Loan.class, loan.getLoanId());

		/*
		 * int id = maxId + 1; bank.setBankName("DwellFunded Bank");
		 * bank.setAccountNo(id); bank.setIfscNo("DF00038");
		 * bank.setUserId(usernamreturn loan;
		 */
	}

	@Override
	public boolean validateLoanTrackerId(String user, String dob) {
		System.out.println("LoanTrackerService.validateUser method...");

		Query qry = manager.createQuery("FROM User WHERE username = :user and dob = :dateOfBirth");
		qry.setParameter("user", user);
		qry.setParameter("dateOfBirth", dob);
		System.out.println("1");
		User u = (User) qry.getSingleResult();
		System.out.println(u);
		if (u != null) {
			System.out.println("Valid login");
			return true;

		} else
			return false;
	}
	
	@Override
	public Loan getloanTracker(String userId) {
		Query qry = manager.createQuery("from Loan where userId = :username");
		qry.setParameter("username", userId);
		Loan loan = (Loan) qry.getSingleResult();
		return loan;
		
		
	}


}
