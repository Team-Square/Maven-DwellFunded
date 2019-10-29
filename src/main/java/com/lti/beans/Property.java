package com.lti.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "Property")
@Table(name = "PROPERTY_DETAILS")
public class Property implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "PROPERTY_ID")
	int propertyId;

	@Column(name = "PROPERTY_LOC")
	String propertyLoc;
	
	@Column(name = "PROPERTY_NAME")
	String propertyName;
	
	@Column(name = "ESTIMATE_AMT")
	String estimateAmt;
	
	@Column(name = "USERNAME")
	String userId;
		
	@Column(name = "STATUS")
	int formStatus;

	public Property(int propertyId, String propertyLoc, String propertyName, String estimateAmt, String userId,
			int formStatus) {
		super();
		this.propertyId = propertyId;
		this.propertyLoc = propertyLoc;
		this.propertyName = propertyName;
		this.estimateAmt = estimateAmt;
		this.userId = userId;
		this.formStatus = formStatus;
	}
	
	public Property(){
		super();
	}

	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyLoc() {
		return propertyLoc;
	}

	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getEstimateAmt() {
		return estimateAmt;
	}

	public void setEstimateAmt(String estimateAmt) {
		this.estimateAmt = estimateAmt;
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
	
	
}
