<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Details</title>
<link rel="stylesheet" href="../resources/css/form.css">

<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#datepicker" ).datepicker();
  } );
  </script>
</head>
<body>
        <div class="logo">
                <img src="../resources/images/output-onlinepngtools.png" >
            </div>
        
    <div class="img_container">

    </div>
    <div class="container">
	<form id="myForm" method="post" action="personalDetails">
		<div id="header">Personal Details</div>
		<div class="body">
			<div class="form_fiels">
				<div class="outer">
					<label class="form_lab required">First Name</label>
					<div class="inner">


						<div class="inner">
							<input type="text" name="firstName"
								value="<c:out value="${user.firstName}"/>">
						</div>
					</div>
				</div>
				<br />

				<div class="outer">
					<label class="form_lab  required">Middle Name</label>
					<div class="inner">
						<div class="inner">
							<input type="text" name="middleName"
								value="<c:out value="${user.middleName}"/>">
						</div>
					</div>
				</div>
				<br />

				<div class="outer">
					<label class="form_lab  required">Last Name</label>
					<div class="inner">
						<div class="inner">
							<input type="text" name="lastName"
								value="<c:out value="${user.lastName}"/>">
						</div>
					</div>
				</div>
				<br />
				<div class="outer">
					<label class="form_lab required">Email Id:</label>
					<div class="inner">
						<div class="inner">
							<input type="text" name="email"
								value="<c:out value="${user.email}"/>">
						</div>
					</div>
				</div>

				<br />
				<div class="outer">
					<label class="form_lab required">Phone No:</label>
					<div class="inner">
						<div class="inner">
							<input type="text" name="contactNo"
								value="<c:out value="${user.contactNo}"/>">
						</div>
					</div>
				</div>

				<br />


				<div class="outer">
					<label class="form_lab required">Date of Birth:</label>
					<div class="inner">
						<div class="inner">
							<input type="text" name="dob" id="datepicker"
								value="<c:out value="${user.dob}"/>">
						</div>
					</div>

					<br />

					<div class="outer">
						<div class="inner">
							<label class="form_lab required">Gender:</label>
						</div>
						<div class="inner">
							<input type="radio" name="gender" value="male"
								<c:if test = "${user.gender == 'male'}">checked</c:if>>Male</input><br>
							<input type="radio" name="gender" value="female"
								<c:if test = "${user.gender == 'female'}">checked</c:if>>Female</input><br>
							<input type="radio" name="gender" value="other"
								<c:if test = "${user.gender == 'other'}">checked</c:if>>Other</input><br>
						</div>

						<br />
						<c:out value="${user.nationality}" />
						<div class="outer">
							<div class="inner required">
								<label class="form_lab">Nationality:</label>
							</div>
							<div class="inner">
								<input type="text" name="nationality"
									value="<c:out value="${user.nationality}"/>">
							</div>
						</div>

						<br />

						<div class="outer">
							<div class="inner">
								<label class="form_lab required">Aadhar Card No :</label>
							</div>
							<div class="inner">
								<input type="text" name="aadhar">
							</div>
						</div>

						<br />

						<div class="outer">
							<div class="inner">
								<label class="form_lab required">Pancard No :</label>
							</div>
							<div class="inner">
								<input type="text" name="pancard">
							</div>
						</div>

						<br />
						<div class="formaction">
							<div class="outer">
								<input type="submit" id="subBtn1" name="subBtn" value="Submit">
							</div>
						</div>



					</div>

				</div>
	</form>

	<!--script src link for jquery and ajax-->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="loginform.js"></script>

</body>
</html>