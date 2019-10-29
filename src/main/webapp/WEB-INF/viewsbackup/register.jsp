<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Here</title>
</head>
<body>
<div class="container">
		<form id="myForm" method="post" action="register">
            <div id="header">Register Here</div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab required">First Name</label>
                        <div class="inner">
                            <div class="inner"><input type="text" name="firstName"></div>                          
                        </div>
                        </div>
                        <br/>

                    <div class="outer"><label class="form_lab  required">Middle Name</label>
                        <div class="inner">
                            <div class="inner"><input type="text" name="middleName"></div>
                        </div>
                        </div>
                      <br/>
                    
                       <div class="outer"><label class="form_lab  required">Last Name</label>
                        <div class="inner">
                            <div class="inner"><input type="text" name="lastName"></div>
                        </div>
                        </div>
<br/>
                        <div class="outer"><label class="form_lab required">Email Id:</label>
                            <div class="inner">
                                <div class="inner"><input type="text" name="email"></div> 
                        </div>
                        </div>
           <br/>             
           				 <div class="outer"><label class="form_lab required">Username:</label>
                            <div class="inner">
                                <div class="inner"><input type="text" name="username"></div> 
                        </div>
                        </div>
           <br/>             

                    <div class="outer"><label class="form_lab required">Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="text" name="password1"></div>
                        </div>
                        </div>
<br/>
                        <div class="outer"><label class="form_lab required">Confirm Password: </label>
                            <div class="inner">
                                <div class="inner"><input type="text" name="password"></div>
                            </div>
                        </div>
<br/>
                            <div class="outer"><label class="form_lab required">Phone No:</label>
                            <div class="inner">
                                <div class="inner"><input type="text" name="contactNo"></div>
                            </div>
                            </div>

<br/>




                        <div class="outer"><label class="form_lab required">Date of Birth:</label>
                                <div class="inner">
                               <div class="inner"><input type="date" name="dob"></div>
                        </div>

<br/>
                        
                        <div class="outer"><div class="inner"><label class="form_lab required">Gender:</label></div>
                            <div class="inner">
                              <input type="radio" name="gender" value="male">Male</input><br>
                              <input type="radio" name="gender" value="female">Female</input><br>
                              <input type="radio" name="gender" value="other">Other</input><br>
                            </div>

<br/>
                            <div class="outer"><div class="inner required"><label class="form_lab">Nationality:</label></div>
                                <div class="inner">
                                    <select name="nationality">
                                        <option value="">-- select one --</option>
                                        <option value="australian">Australian</option>
                                        <option value="belgian">Belgian</option>
                                        <option value="canada">Canada</option>
                                        <option value="egyptian">Egyptian</option>
                                        <option value="france">France</option>
                                        <option value="greek">Greek</option>
                                        <option value="india">India</option></select>
                                </div>
                            </div>
                        </div>
                        <input type="hidden" name="aadhar">
                        <input type="hidden" name="pancard">
 <br/>                               
                        <div class="formaction">
                        <div class="outer">
                            <input type="submit" id="subBtn1" name="subBtn" value="Submit">
                        </div>
                    </div>

       
    
                </div>
                
            </div>
		</form>
    </div>
</body>
</html>