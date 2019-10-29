package com.lti.dao;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.beans.User;

@Repository
@Scope("singleton")  // By default spring objects are singleton.
@Transactional(propagation=Propagation.REQUIRED)
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager manager;

	
	@Override
	public boolean validateUser(String user, String password) {
		System.out.println("LoginService.validateUser method...");
		
		Query qry=manager.createQuery("FROM User WHERE username = :user and password = :pass");
		qry.setParameter("user", user);
		qry.setParameter("pass", password);
		System.out.println("1");
		User u=(User) qry.getSingleResult();
		System.out.println(u);
		if(u!=null){
			System.out.println("Valid login");
			return true;
			
		}
		else return false;
		
	}
	
	@Override
	public boolean validateAdminUser(String user, String password) {
		System.out.println("LoginService.validateADMINUser method...");
		
		if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin"))
		{
			return true;
		}
		return false;
	}
	
	@Override
	public void insertRegDetails(User user) {
		manager.persist(user);		
	}

	@Override
	public User getUserDetails(String username) {
		
		Query qry=manager.createQuery("SELECT u FROM User u WHERE u.username = :user");
		qry.setParameter("user", username);
		System.out.println("USERDAO IMPL method");
		System.out.println(username);
		System.out.println("D1");
		
		//User userResult = null;
		//Country c = (Country)query.getSingleResult();
		
		User userResult = (User)qry.getSingleResult();
		//userResult = (User) qry.getSingleResult();
		System.out.println("D2");
		System.out.println(userResult);
		System.out.println(userResult.getFirstName()+" "+userResult.getLastName());
		System.out.println("D3");
		return userResult;
	}

	@Override
	public User setUserDetails(User user,BigDecimal aadhar,String pancard,String username) {
		//user.setAadhar(aadhar);
		//user.setPancard(pancard);
		
		Query qry=manager.createQuery("UPDATE User u set u.aadhar = :aadhar , u.pancard = :pancard WHERE u.username = :user");
		qry.setParameter("aadhar", aadhar);
		qry.setParameter("pancard", pancard);
		qry.setParameter("user", username);
		
		int updateCount = qry.executeUpdate();
		if(updateCount > 0)
		{
			System.out.println("SUCCESS");
		}else{
			System.out.println("ERROR");
		}
		
		//manager.s;
		return user;
	}

	
}
