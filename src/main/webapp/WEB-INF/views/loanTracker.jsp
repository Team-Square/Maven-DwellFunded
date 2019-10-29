<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Tracker Page</title>
</head>
<body>
<body>
			<div class="logo">
                <img src="C:\Users\AE206_PC17\Downloads\output-onlinepngtools.png" >
            </div>
        
    <div class="img_container">
    </div>
    <div class="container">
<form id="myForm" action="loanTracker" method="post">
            <div id="header">Property Details</div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab">Username :</label>
                        <div class="inner required"><input type="text" id="username" value ="${sessionScope.username}" name="username" disabled></div>
                        
                    </div>
<br/>
                    <div class="outer"><label class="form_lab">Date of Birth</label>
                        <div class="inner required"><input type="text" id="dob" name="dob"></div>
                        
                    </div>
                    
                    <c:out value="${sessionScope.username}"></c:out>
                    <c:set var = "userid" value = "${sessionScope.username}"/>
                    <input type="hidden" name="userId" value="<c:out value = '${userid}'/>">
                    
                    <input type="hidden" name="formStatus" value="0"/>
                </div>
                <div class="formaction">
                    <div class="outer">
                        <input type="submit" id="nextBtn" name="nextBtn" value="Next">
                    </div>
                </div>
                
            </div>
		</form>
</body>
</html>
