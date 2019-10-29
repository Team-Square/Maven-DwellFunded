<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Summary</title>
</head>
<body>
Account Summary
<div>
<table border="1">
			<tr>
				<th>Bank Name </th>
				<th>Account Number</th>
				<th>IFSC Number</th>
				
			</tr>
			<tr>
				<td>${accSum.bankName}</td>
				<td>${accSum.accountNo}</td>
				<td>${accSum.ifscNo}</td>
			</tr>
			
			
		</table>

</div>

</body>
</html>