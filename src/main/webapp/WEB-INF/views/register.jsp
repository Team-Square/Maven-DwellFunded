<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>Welcome to Bank!!!!!!</title>
    <!--CSS link is inserted here-->
    <link rel="stylesheet" href="../resources/css/form.css">
	  <!--script src link for jquery and ajax-->
	  
   <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="resources/demos/style.css">
  
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>


	
</head>

<body>
        <div class="logo">
                <img src="../resources/images/output-onlinepngtools.png" >
            </div>
        
    <div class="img_container">

    </div>
    <div class="container">
        <form id="myForm" method="post" action="register">
            <div id="header"><b><u>Register Here</u></b></div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab required">First Name</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="fname" name="first_name"></div>
                            <div class="err_msg fname"><span class="ex_mark">!</span>Enter Your First Name</div>
                        </div>
                    </div>


                    <div class="outer"><label class="form_lab ">Middle Name</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="mname" name="middle_name" onsubmit="submit"></div>
                            <div class="err_msg"><span class="ex_mark">!</span>Enter Your Middle Name</div>
                        </div>
                    </div>


                    <div class="outer"><label class="form_lab  required">Last Name</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="lname" name="last_name"></div>
                            <div class="err_msg lname"><span class="ex_mark">!</span>Enter Your Last Name</div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Email Id:</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="email" name="email_id"></div>
                            <div class="err_msg email"><span class="ex_mark">!</span>Enter EmailId</div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Username:</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="user" name="username"></div>
                            <div class="err_msg user"><span class="ex_mark">!</span>Enter Username</div>
                        </div>
                    </div>


                    <div class="outer"><label class="form_lab required">Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass1" name="password"></div>
                            <div class="inner"><span id="icon">i</span>Password must be at least 6 characters</div>
                            <div class="err_msg pass1"><span class="ex_mark">!</span>Enter password password</div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Confirm Password: </label>
                        <div class="inner">
                            <div class="inner"><input type="password" id="pass2" name="password"></div>
                            <div class="err_msg pass2"><span class="ex_mark">!</span>Please reenter password to confirm
                            </div>
                        </div>
                    </div>

                    <div class="outer"><label class="form_lab required">Phone No:</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="phno" name="phone number"></div>
                            <div class="err_msg phno"><span class="ex_mark">!</span>Enter your phone no</div>
                        </div>
                    </div>






                    <div class="outer"><label class="form_lab required">Date of Birth:</label>
                        <div class="inner">
                            <div class="inner"><input type="text" id="dob" name="bday"></div>
                            <div id="dateofbirthvalidate"></div>
                            <div class="err_msg dob"><span class="ex_mark">!</span>Enter your date of Birth</div>

                        </div>



                        <div class="outer">
                            <div class="inner"><label class="form_lab required">Gender:</label></div>
                            <div class="inner">
                                <input type="radio" class="gender" name="gender" value="male">Male</input><br>
                                <input type="radio" class="gender" name="gender" value="female">Female</input><br>
                                <input type="radio" class="gender" name="gender" value="other">Other</input><br>
                                <div class="err_msg"><span class="ex_mark">!</span>Select Your Gender</div>
                            </div>


                            <div class="outer">
                                <div class="inner required"><label class="form_lab">Nationality:</label></div>
                                <div class="inner">
                                        <div class="inner"><input type="text" id="nation" name="nationality"></div>
                                        <div id="nationailityvalidate"></div>
                                    <!--<select name="nationality" class="nation">
                                        <option value="">-- select one --</option>
                                        <option value="australian">Australian</option>
                                        <option value="belgian">Belgian</option>
                                        <option value="canada">Canada</option>
                                        <option value="egyptian">Egyptian</option>
                                        <option value="france">France</option>
                                        <option value="greek">Greek</option>
                                        <option value="india">India</option>
                                    </select>-->
                                    <div class="err_msg nation"><span class="ex_mark">!</span>Enter nationality!</div>
                                </div>
                            </div>
                        </div>

                        <div class="formaction">
                            <div class="outer">
                                <input type="submit" id="subBtn1" name="subBtn" value="Submit">
                                <div class="inner"><span id="icon">&nbsp; &nbsp;Already have an Account <a href="#"
                                            class="link">Sign in here</a></span></div>
                            </div>
                        </div>



                    </div>

                </div>
        </form>
    </div>

   
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="../resources/script/registrationform.js"></script>
</body>

</html>