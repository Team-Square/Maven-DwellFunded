<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loan Application Details</title>
</head>
<body>
WELCOME
<h1>Personal Details</h1>
<table>
		<tr>
			<th>First Name</th>
			<td>${user.firstName }</td>
		</tr>
		<tr>
			<th>Middle Name</th>
			<td>${user.middleName }</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${user.lastName }</td>
		</tr>		
		<tr>
			<th>Email</th>
			<td>${user.email }</td>
		</tr>
		<tr>
			<th>Username</th>
			<td>${user.username }</td>
		</tr>
		
	</table>

<h1>Income Details</h1>

<table>
		<tr>
			<th>Type of Employment</th>
			<td>${income.typeOfEmp }</td>
		</tr>
		<tr>
			<th>Retire Age</th>
			<td>${income.retireAge }</td>
		</tr>
		<tr>
			<th>Organization Type</th>
			<td>${income.orgType }</td>
		</tr>
		<tr>
			<th>Employer Name</th>
			<td>${income.empName }</td>
		</tr>
		
	</table>

<h1>Property Details</h1>

<table>
		<tr>
			<th>PS Number</th>
			<td>${property.propertyLoc }</td>
		</tr>
		<tr>
			<th>First Name</th>
			<td>${property.propertyName }</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${property.estimateAmt }</td>
		</tr>
		
	</table>


<h1>Loan Details</h1>
	<table>
		<tr>
			<th>PS Number</th>
			<td>${loan.loanId }</td>
		</tr>
		<tr>
			<th>First Name</th>
			<td>${loan.loanAmt }</td>
		</tr>
		<tr>
			<th>Last Name</th>
			<td>${loan.tennure }</td>
		</tr>
		<tr>
			<th>Email</th>
			<td>${loan.rateOfInt }</td>
		</tr>
		
	</table>
	
	<div>View Uploaded Documents Here :</div>
	
	<table>
		<tr>
			<th>Aadhar Card </th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		<tr>
			<th>Pancard Card</th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		<tr>
			<th>Voter's Id </th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		<tr>
			<th>Salary Slip </th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		<tr>
			<th>LOA  </th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		<tr>
			<th>NOC from Builder </th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		<tr>
			<th>Agreement</th>
			<td><a href="downloadFiles.jsp?id=${user.username}">Download Here</a></td>
		</tr>
		
	</table>
	<form id ="myForm">
	<input type="hidden" value="${user.username}" name="id"/><br/>
	<input type="hidden" value="${user.email}" name="email"/>
	<input type="submit" value="ACCEPT" formaction="acceptRequest">
	<a href="acceptRequest?id=${user.username}&email=${user.email}">ACCEPT</a><br/>
	<a href="rejectRequest?id=${user.username}&email=${user.email}">REJECT</a>
	<input type="submit" value="REJECT" formaction="rejectRequest?id=${user.username}">
	</form>
</body>
</html>