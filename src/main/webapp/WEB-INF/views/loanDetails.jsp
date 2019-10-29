<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Loan Details</title>
<link rel="stylesheet" href="../resources/css/form.css">

</head>
<body>
	<form id="myForm" method="post" action="loanDetails">
		<div id="header">Loan Details</div>
		<div class="body">
			<div class="form_fiels">
				<div class="outer">
					<label class="form_lab">Loan Amount</label>
					<div class="inner required">
						<input type="text" id="loanAmt" name="loanAmt">
					</div>

				</div>
				<br />
				<div class="outer">
					<label class="form_lab">Tennure</label>
					<div class="inner required">
						<input type="text" id="tennure" name="tennure">
					</div>

				</div>
				<br />
				<div class="outer">
					<label class="form_lab">Rate of  Interest : 8.5</label>
					<div class="inner required">
						<input type="hidden" id="rateOfInt" name="rateOfInt" value="8.5">
					</div>
					<br />
				</div>
				<c:out value="${sessionScope.username}"></c:out>
				<c:set var="userid" value="${sessionScope.username}" />
				<input type="hidden" name="userId"
					value="${sessionScope.username}" > <input type="hidden"
					name="formStatus" value="0" />
					
					
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