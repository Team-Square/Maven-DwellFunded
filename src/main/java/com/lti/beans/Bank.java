package com.lti.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name = "Bank")
@Table(name = "BANK_DETAILS")
public class Bank implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BID")
	@SequenceGenerator(name="BID" , sequenceName = "BANK_ID_SEQ", allocationSize = 1)
	@Column(name = "BANK_ID")
	int id;
	
	@Column(name = "BANK_NAME")
	String bankName;
	
	@Column(name = "ACCOUNT_NO")
	int accountNo;
	
	@Column(name = "IFSC_NO")
	String ifscNo;
	
	@Column(name = "USERNAME")
	String userId;
		
	@Column(name = "STATUS")
	int formStatus;

	public Bank(int id, String bankName, int accountNo, String ifscNo, String userId, int formStatus) {
		super();
		this.id = id;
		this.bankName = bankName;
		this.accountNo = accountNo;
		this.ifscNo = ifscNo;
		this.userId = userId;
		this.formStatus = formStatus;
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

	public Bank(){
		super();
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscNo() {
		return ifscNo;
	}

	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}
	
	
}
