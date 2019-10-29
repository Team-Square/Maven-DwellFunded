package com.lti.beans;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.springframework.context.annotation.Scope;

@NamedQueries({
	@NamedQuery(name="queryVal", query="FROM User WHERE username = :user and password = :pass")
})
@Entity(name = "User")
@Table(name = "USER_DETAILS")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "USER_ID")
	int userid;
	
	@Column(name = "FIRST_NAME")
	String firstName;
	
	@Column(name = "MIDDLE_NAME")
	String middleName;
	
	@Column(name = "LAST_NAME")
	String lastName;
	
	@Column(name = "EMAIL_ID")
	String email;
	
	@Column(name = "USERNAME")
	String username;
	
	@Column(name = "PASSWORD")
	String password;
	
	@Column(name = "CONTACT_NO")
	int contactNo;
	
	@Column(name = "DATE_OF_BIRTH")
	String dob;
	
	@Column(name = "GENDER")
	String gender;
	
	@Column(name = "NATIONALITY")
	String nationality;
	
	@Column(name = "ADHAR_NO")
	BigDecimal aadhar;
	
	@Column(name = "PANCARD_NO")
	String pancard;
	
	public User(){
		super();
	}
	
	public User(int userid, String firstName,String middleName, String lastName, String email, String username, String password,
			int contactNo, String dob, String gender, String nationality, BigDecimal aadhar, String pancard) {
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.contactNo = contactNo;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadhar = aadhar;
		this.pancard = pancard;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public User(int userid, String firstName,String middleName, String lastName, String email, String username, String password,
			int contactNo, String dob, String gender, String nationality){
		super();
		this.userid = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.contactNo = contactNo;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
	}

	
	
	
	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	
	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	
	public BigDecimal getAadhar() {
		return aadhar;
	}

	public void setAadhar(BigDecimal aadhar) {
		this.aadhar = aadhar;
	}

	
	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	
	
	

}
