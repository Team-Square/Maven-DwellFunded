package com.lti.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "INCOME_DETAILS")
public class Income implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "INCOME_ID")
	int incomeId;
	
	@Column(name = "TYPE_OF_EMP")
	String typeOfEmp;
	
	@Column(name = "RETIRE_AGE")
	int retireAge;
	
	@Column(name = "ORG_TYPE")
	String orgType;
	
	@Column(name = "EMPLOYER_NAME")
	String empName;
	
	@Column(name = "USERNAME")
	String userId;
		
	@Column(name = "STATUS")
	int formStatus;
	
	
	public Income(){
		super();
	}


	public int getIncomeId() {
		return incomeId;
	}


	public void setIncomeId(int incomeId) {
		this.incomeId = incomeId;
	}


	public String getTypeOfEmp() {
		return typeOfEmp;
	}


	public void setTypeOfEmp(String typeOfEmp) {
		this.typeOfEmp = typeOfEmp;
	}


	public String getOrgType() {
		return orgType;
	}


	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}


	public Income(int incomeId, String typeOfEmp, String orgType, String empName, String userId, int retireAge,
			int formStatus) {
		super();
		this.incomeId = incomeId;
		this.typeOfEmp = typeOfEmp;
		this.orgType = orgType;
		this.empName = empName;
		this.userId = userId;
		this.retireAge = retireAge;
		this.formStatus = formStatus;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public int getRetireAge() {
		return retireAge;
	}


	public void setRetireAge(int retireAge) {
		this.retireAge = retireAge;
	}


	public int getFormStatus() {
		return formStatus;
	}


	public void setFormStatus(int formStatus) {
		this.formStatus = formStatus;
	}
	
	
	
	
}
