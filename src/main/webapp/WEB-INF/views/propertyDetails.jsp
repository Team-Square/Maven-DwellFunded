<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Property Details</title>
  <link rel="stylesheet" href="../resources/css/form.css">

</head>
<body>
 <div class="img_container">
       
    </div>
	<div class="container2">
<form id="myForm" method="post" action="propertyDetails">
              <div id="header3"><b><u>Property Details</u></b></div>
            <div class="body">
                <div class="form_fiels">
                    <div class="outer"><label class="form_lab">Property Location</label>
                        <div class="inner required"><input type="text" id="property_loc" name="propertyLoc"></div>
                        <div class="err_msg"><span class="ex_mark">!</span>Enter property location</div>
                    </div>

                    <div class="outer"><label class="form_lab">Property Name</label>
                        <div class="inner required"><input type="text" id="property_name" name="propertyName"></div>
                        <div class="err_msg"><span class="ex_mark">!</span>Enter property name</div>
                    </div>

                    <div class="outer"><label class="form_lab">Estimated Amount</label>
                        <div class="inner required"><input type="text" id="estimate_amt" name="estimateAmt"></div>
                        <div class="err_msg"><span class="ex_mark">!</span>Enter estimated amount</div>
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
</body>
</html>