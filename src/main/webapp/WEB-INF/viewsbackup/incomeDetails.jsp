<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Income Details</title>
</head>
<body>
HELLOOOOOO.............
<form id="myForm" method="post" action="incomeDetails">
            <div id="header4"><b><u>Income Details</u></b></div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab required">Type of Employment</label>
                        <div class="inner">
                                <input type="radio" class="type_of_emp" name="typeOfEmp" value="Salaried"> Salaried<br>
                                <input type="radio" class="type_of_emp" name="typeOfEmp" value="SelfEmp"> Self Employed<br>
                        </div>
                        
                    </div>

                    <div class="outer"><label class="form_lab required">Retirement Age</label>
                        <div class="inner"><input type="text" id="retireAge" name="retireAge"></div>
                       
                    </div>

                    <div class="outer"><label class="form_lab required">Organization Type</label>
                        <div class="inner"><input type="text" id="orgType" name="orgType"></div>
                       
                    </div>

                    <div class="outer"><label class="form_lab required">Employer Name:</label>
                        <div class="inner"><input type="text" id="empName" name="empName"></div>
                        
                    </div>
                    
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
</body>
</html>