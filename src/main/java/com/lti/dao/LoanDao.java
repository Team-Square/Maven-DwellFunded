package com.lti.dao;

import com.lti.beans.Loan;

public interface LoanDao {

	public Loan insertLoanDetails(Loan loan);
	
	public Loan getloanTracker(String userId);
	
	public boolean validateLoanTrackerId(String user,String dob);
}
