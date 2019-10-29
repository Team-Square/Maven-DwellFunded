package com.lti.services;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.lti.beans.Bank;
import com.lti.beans.Income;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;
import com.lti.dao.AdminDao;
import com.lti.dao.BankDao;
import com.lti.dao.IncomeDao;
import com.lti.dao.LoanDao;
import com.lti.dao.PropertyDao;
import com.lti.dao.UserDao;

@Service("userService")
public class UserServicesImpl implements UserServices{
	
	@Autowired
	UserDao userdao;
	
	@Autowired
	IncomeDao incomedao;
	
	@Autowired
	PropertyDao propertydao;
	
	@Autowired
	BankDao bankdao;
	
	@Autowired
	LoanDao loandao;
	
	@Autowired
	AdminDao admindao;
	
	public boolean validateUser(String user, String password) {
		return userdao.validateUser(user,password);
	}
	
	@Override
	public boolean validateAdminUser(String user, String password) {
		return userdao.validateAdminUser(user,password);
	}
	
	public void insertRegDetails(User user){
		userdao.insertRegDetails(user);
	}

	@Override
	public User getUserDetails(String username) {
		return userdao.getUserDetails(username);
		 
	}

	@Override
	public Income insertIncomeDetails(Income income) {
		return incomedao.insertIncomeDetails(income);
	}

	@Override
	public Property insertPropertyDetails(Property property) {
		return propertydao.insertPropertyDetails(property);
	}

	@Override
	public User setUserDetails(User user,BigDecimal aadhar,String pancard,String username) {
		return userdao.setUserDetails(user,aadhar,pancard,username);
	}

	@Override
	public Bank insertBankDetails(Bank bank) {
		return bankdao.insertBankDetails(bank);
	}

	@Override
	public Bank insertNewBankDetails(String username) {
		return bankdao.insertNewBankDetails(username);
	}
	
	@Override
	public Bank getAccountSummary(String username) {
		return bankdao.getAccountSummary(username);
	}

	@Override
	public Loan insertLoanDetails(Loan loan) {
		return loandao.insertLoanDetails(loan);
	}

	@Override
	public List<Loan> getLoanList() {
		return admindao.getLoanList();
	}
	
	@Override
	public List<Loan> getAcceptedLoanList() {
		return admindao.getAcceptedLoanList();
	}

	@Override
	public List<Loan> getRejectedLoanList() {
		return admindao.getRejectedLoanList();
	}
	
	@Override
	public List<Loan> getDocVerifiedLoanList() {
		return admindao.getDocVerifiedLoanList();
	}

	@Override
	public List<Loan> getFundTransferLoanList() {
		return admindao.getFundTransferLoanList();
	}

	@Override
	public String getLoanUsername(int loanId) {
		return admindao.getLoanUsername(loanId);
	}

	@Override
	public User getLoanUserDetails(String userId) {
		return admindao.getLoanUserDetails(userId);
	}

	@Override
	public Income getLoanIncomeDetails(String userId) {
		return admindao.getLoanIncomeDetails(userId);
	}

	@Override
	public Property getLoanPropDetails(String userId) {
		return admindao.getLoanPropDetails(userId);
	}
	
	@Override
	public Loan getLoanAppDetails(int loanId) {
		return admindao.getLoanAppDetails(loanId);
	}

	@Override
	public int acceptRequest(String userId) {
		return admindao.acceptRequest(userId);
	}

	@Override
	public int rejectRequest(String userId) {
		return admindao.rejectRequest(userId);
	}

	@Override
	public int docVerifyRequest(String userId) {
		return admindao.docVerifyRequest(userId);
	}

	@Override
	public int fundTransferRequest(String userId) {
		return admindao.fundTransferRequest(userId);
	}

	
	@Override
	public Loan getloanTracker(String userId) {
		return loandao.getloanTracker(userId);
	}

	@Override
	public boolean validateLoanTrackerId(String user, String dob) {
		return loandao.validateLoanTrackerId(user,dob);
	}


	
	
}
