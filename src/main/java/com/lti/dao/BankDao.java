package com.lti.dao;

import com.lti.beans.Bank;

public interface BankDao {

	public Bank insertBankDetails(Bank bank);
	
	public Bank insertNewBankDetails(String username);
	
	public Bank getAccountSummary(String username);
}
