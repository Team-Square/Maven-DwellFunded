<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Income Details</title>
<link rel="stylesheet" href="../resources/css/form.css">
</head>
<body>
 <div class="img_container">
       
    </div>
	<div class="container">
<form id="myForm" method="post" action="incomeDetails">
             <div id="header4"><b><u>Income Details</u></b></div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab required">Type of Employment</label>
                        <div class="inner">
                                <input type="radio" class="type_of_emp" name="typeOfEmp" value="Salaried"> Salaried<br>
                                <input type="radio" class="type_of_emp" name="typeOfEmp" value="SelfEmp"> Self Employed<br>
                        </div>
                        <div class="err_msg"><span class="ex_mark">!</span>Select type of employment</div>
                    </div>

                    <div class="outer"><label class="form_lab required">Retirement Age</label>
                        <div class="inner"><input type="text" id="retire_age" name="retireAge"></div>
                        <div class="err_msg retire_age"><span class="ex_mark">!</span>Enter retirement age</div>
                    </div>

                    <div class="outer"><label class="form_lab required">Organization Type</label>
                        <div class="inner"><input type="text" id="org_type" name="orgType"></div>
                        <div class="err_msg org_type"><span class="ex_mark">!</span>Enter organization type</div>
                    </div>

                    <div class="outer"><label class="form_lab required">Employer Name:</label>
                        <div class="inner"><input type="text" id="emp_name" name="empName"></div>
                        <div class="err_msg emp_name"><span class="ex_mark">!</span>Enter employer name</div>
                    </div>
                </div>
                    <c:out value="${sessionScope.username}"></c:out>
                    <c:set var = "userid" value = "${sessionScope.username}"/>
                    <input type="hidden" name="userId" value="<c:out value = '${userid}'/>">
                    
                    <input type="hidden" name="formStatus" value="0"/>
                </div>
                <div class="formaction">
                    <div class="outer">
                        <input type="submit" id="subBtn1" name="nextBtn" value="Next">
                    </div>
                </div>
                
            </div>
		</form>
		
		 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		 <script type="text/javascript" src="../resources/script/income.js"></script>
</body>
</html>