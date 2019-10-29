package com.lti.dao;

import java.util.List;

import com.lti.beans.Income;
import com.lti.beans.Loan;
import com.lti.beans.Property;
import com.lti.beans.User;

public interface AdminDao {

	public List<Loan> getLoanList();
	
	public Loan getLoanAppDetails(int loanId);
	
	public String getLoanUsername(int loanId);
	
	public User getLoanUserDetails(String userId);
	
	public Income getLoanIncomeDetails(String userId);
	
	public Property getLoanPropDetails(String userId);
	
	public int acceptRequest(String userId);
	
	public int rejectRequest(String userId);
	
	public int docVerifyRequest(String userId);
	
	public int fundTransferRequest(String userId);
	
	public List<Loan> getAcceptedLoanList();
	
	public List<Loan> getRejectedLoanList();
	
	public List<Loan> getDocVerifiedLoanList();
	
	public List<Loan> getFundTransferLoanList();
	
}
