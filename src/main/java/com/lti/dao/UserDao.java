package com.lti.dao;

import java.math.BigDecimal;
import java.util.List;


import com.lti.beans.User;

public interface UserDao {

	public boolean validateUser(String user, String password);
	
	public boolean validateAdminUser(String user, String password);
	
	public void insertRegDetails(User user);
	
	public User getUserDetails(String username);
	
	public User setUserDetails(User user, BigDecimal aadhar,String pancard,String username);
}
