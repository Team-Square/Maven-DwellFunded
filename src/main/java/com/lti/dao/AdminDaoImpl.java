package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.Income;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;

@Repository
@Scope("singleton")  // By default spring objects are singleton.
@Transactional(propagation=Propagation.REQUIRED)
public class AdminDaoImpl implements AdminDao{

	@PersistenceContext
	private EntityManager manager;

	
	@Override
	public List<Loan> getLoanList() {
		Query qry = manager.createQuery("FROM Loan where formStatus = 0");
		return qry.getResultList();
	}


	@Override
	public List<Loan> getAcceptedLoanList() {
		Query qry = manager.createQuery("FROM Loan where formStatus = 1");
		return qry.getResultList();
	}


	@Override
	public List<Loan> getRejectedLoanList() {
		Query qry = manager.createQuery("FROM Loan where formStatus = 2");
		return qry.getResultList();
	}
	
	@Override
	public List<Loan> getDocVerifiedLoanList() {
		Query qry = manager.createQuery("FROM Loan where formStatus = 3");
		return qry.getResultList();
	}


	@Override
	public List<Loan> getFundTransferLoanList() {
		Query qry = manager.createQuery("FROM Loan where formStatus = 4");
		return qry.getResultList();
	}

	@Override
	public Loan getLoanAppDetails(int loanId) {
		Loan loan = manager.find(Loan.class, loanId);
		return loan;
	}


	@Override
	public String getLoanUsername(int loanId) {
		Loan loan = manager.find(Loan.class, loanId);
		return loan.getUserId();

	}


	@Override
	public User getLoanUserDetails(String userId) {
		Query qry = manager.createQuery("FROM User where username = :username");
		qry.setParameter("username", userId);
		return (User) qry.getSingleResult();
	}


	@Override
	public Income getLoanIncomeDetails(String userId) {
		Query qry = manager.createQuery("FROM Income where username = :username");
		qry.setParameter("username", userId);
		return (Income) qry.getSingleResult();
	}


	@Override
	public Property getLoanPropDetails(String userId) {
		Query qry = manager.createQuery("FROM Property where username = :username");
		qry.setParameter("username", userId);
		return (Property) qry.getSingleResult();
	}


	@Override
	public int acceptRequest(String userId) {
		Query qry=manager.createQuery("UPDATE Loan set status=1 where username = : username");
		qry.setParameter("username",userId);
		int updateCount=0;
		updateCount=qry.executeUpdate();
		return updateCount;
	}


	@Override
	public int rejectRequest(String userId) {
		Query qry=manager.createQuery("UPDATE Loan set status=2 where username = : username");
		qry.setParameter("username",userId);
		int updateCount=0;
		updateCount=qry.executeUpdate();
		return updateCount;
	}


	@Override
	public int docVerifyRequest(String userId) {
		Query qry=manager.createQuery("UPDATE Loan set status=3 where username = : username");
		qry.setParameter("username",userId);
		int updateCount=0;
		updateCount=qry.executeUpdate();
		return updateCount;
	}


	@Override
	public int fundTransferRequest(String userId) {
		Query qry=manager.createQuery("UPDATE Loan set status=4 where username = : username");
		qry.setParameter("username",userId);
		int updateCount=0;
		updateCount=qry.executeUpdate();
		return updateCount;
	}

	
}
