<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Property Details</title>
</head>
<body>
<form id="myForm" method="post" action="propertyDetails">
            <div id="header">Property Details</div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab">Property Location</label>
                        <div class="inner required"><input type="text" id="property_loc" name="propertyLoc"></div>
                        
                    </div>
<br/>
                    <div class="outer"><label class="form_lab">Property Name</label>
                        <div class="inner required"><input type="text" id="property_name" name="propertyName"></div>
                        
                    </div>
<br/>
                    <div class="outer"><label class="form_lab">Estimated Amount</label>
                        <div class="inner required"><input type="text" id="estimate_amt" name="estimateAmt"></div>
 <br/>                       
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