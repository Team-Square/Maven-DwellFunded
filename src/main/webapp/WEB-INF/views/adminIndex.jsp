<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
</head>
<body>
	WELCOME ADMIN!!!
	<div>
		Pending List .....

		<table border="1">
			<tr>
				<th>Loan Application ID</th>
				<th>View Details</th>
			</tr>
			<!-- For loop -->
			<c:forEach items="${requestScope.list}" var="loanList">
				<tr>
					<td>${loanList.loanId}</td>
					<td><a href="loanIdDetails.jsp?id=${loanList.loanId}">View
							Details </a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div>
		Accepted List table 
		<table border="1">
		<tr>
			<th>Loan Application ID</th>
			<th>View Details</th>
		</tr>
		<!-- For loop -->
		<c:forEach items="${requestScope.acceptlist}" var="accloanList">
			<tr>
				<td>${accloanList.loanId}</td>
				<td><a href="documentVerify?id=${accloanList.loanId}">Verify Document </a></td>
			</tr>
		</c:forEach>
		</table>

	</div>
	
	<div>
		Rejected List
		<table border="1">
		
		<tr>
			<th>Loan Application ID</th>
			
		</tr>
		<!-- For loop -->
		<c:forEach items="${requestScope.rejectlist}" var="rejloanList">
			<tr>
				<td>${rejloanList.loanId}</td>
				
			</tr>
		</c:forEach>
		</table>

	</div>

	<div>
		Document Verification List 
		<table border="1">
		<tr>
			<th>Loan Application ID</th>
			<th>Approve Fund Transfer</th>
		</tr>
		<!-- For loop -->
		<c:forEach items="${requestScope.doclist}" var="docloanList">
			<tr>
				<td>${docloanList.loanId}</td>
				<td><a href="fundTransfer?id=${docloanList.loanId}">Approve Fund Transfer </a></td>
			</tr>
		</c:forEach>
		</table>

	</div>
	
	<div>
		Final Credit Transferred List 
		<table border="1">
		<tr>
			<th>Loan Application ID</th>
		</tr>
		<!-- For loop -->
		<c:forEach items="${requestScope.fundlist}" var="fundloanList">
			<tr>
				<td>${fundloanList.loanId}</td>
				
			</tr>
		</c:forEach>
		</table>

	</div>

</body>
</html>