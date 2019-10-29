package com.lti.services;

import java.math.BigDecimal;
import java.util.List;


import com.lti.beans.Bank;
import com.lti.beans.Income;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;

public interface UserServices {

	public boolean validateUser(String user, String password);
	
	public boolean validateAdminUser(String user, String password);
	
	public void insertRegDetails(User user);
	
	public User getUserDetails(String username);
	
	public User setUserDetails(User user,BigDecimal aadhar,String pancard,String username);
	
	public Income insertIncomeDetails(Income income);
	
	public Property insertPropertyDetails(Property property);
	
	public Bank insertBankDetails(Bank bank);
	
	public Bank insertNewBankDetails(String username);
	
	public Bank getAccountSummary(String username);
	
	public Loan insertLoanDetails(Loan loan);
	
	public List<Loan> getLoanList();
	
	public List<Loan> getAcceptedLoanList();
	
	public List<Loan> getRejectedLoanList();
	
	public List<Loan> getDocVerifiedLoanList();
	
	public List<Loan> getFundTransferLoanList();
	
	public Loan getLoanAppDetails(int loanId);
	
	public String getLoanUsername(int loanId);
	
	public User getLoanUserDetails(String userId);
	
	public Income getLoanIncomeDetails(String userId);
	
	public Property getLoanPropDetails(String userId);
	
	public int acceptRequest(String userId);
	
	public int rejectRequest(String userId);
	
	public int docVerifyRequest(String userId);
	
	public int fundTransferRequest(String userId);
	
	public Loan getloanTracker(String userId);
	
	public boolean validateLoanTrackerId(String user,String dob);
	
	
}
