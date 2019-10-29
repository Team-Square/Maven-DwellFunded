package com.lti.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Loan")
@Table(name = "LOAN_DETAILS")
public class Loan implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LID")
	@SequenceGenerator(name="LID" , sequenceName = "LOAN_ID_SEQ", allocationSize = 1)
	@Column(name = "LOAN_ID")
	int loanId;
	
	@Column(name = "LOAN_AMT")
	int loanAmt;
	
	@Column(name = "TENNURE")
	int tennure;
	
	@Column(name = "RATE_OF_INT")
	String rateOfInt;
	
	public Loan(){
		super();
	}
	
	public Loan(int loanId, int loanAmt, int tennure, String rateOfInt, String userId, int formStatus) {
		super();
		this.loanId = loanId;
		this.loanAmt = loanAmt;
		this.tennure = tennure;
		this.rateOfInt = rateOfInt;
		this.userId = userId;
		this.formStatus = formStatus;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public int getLoanAmt() {
		return loanAmt;
	}

	public void setLoanAmt(int loanAmt) {
		this.loanAmt = loanAmt;
	}

	public int getTennure() {
		return tennure;
	}

	public void setTennure(int tennure) {
		this.tennure = tennure;
	}

	public String getRateOfInt() {
		return rateOfInt;
	}

	public void setRateOfInt(String rateOfInt) {
		this.rateOfInt = rateOfInt;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getFormStatus() {
		return formStatus;
	}

	public void setFormStatus(int formStatus) {
		this.formStatus = formStatus;
	}

	@Column(name = "USERNAME")
	String userId;
		
	@Column(name = "STATUS")
	int formStatus;

	
	
}
