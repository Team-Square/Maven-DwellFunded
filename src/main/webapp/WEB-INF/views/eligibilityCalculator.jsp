<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Eligiblity Page</title>
<link rel="stylesheet" href="../resources/css/form.css">
</head>
<body>
	<div class="logo">
		<img src="../reources/images/output-onlinepngtools.png">
	</div>

	<div class="img_container"></div>
	<div class="container">
		<form id="myForm" action="personalDetails">
			<div id="header4">
				<b><u>ELIGIBILITY CALCULATOR</u></b>
			</div>
			<div class="body">

				<div class="outer">
					<label class="form_lab required">Monthly Income</label>
					<div class="inner">
						<input type="text" id="month" name="monthincome"
							placeholder="Enter Period">
					</div>
				</div>

				<div class="outer">
					<label class="form_lab required">Rate Of Interest</label>
					<div class="inner">
						<input type="text" name="InterestRate" id="nnterestRate"
							value="8.5%" disabled="disabled">
					</div>
				</div>
				<div class="outer">
					<input type="button" id="subBtn1" name="subBtn" value="Calculate"
						onclick="Eligibility();">
				</div>
				<div class="outer">
					<label class="form_lab required">Eligible Loan:</label>
					<div class="inner">
						<input type="text" name="emi" id="emi">
					</div>
				</div>
				<div class="outer">
					<input type="submit" id="nextBtn" name="subBtn" value="Next">
				</div>
			</div>

		</form>

	</div>



	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="../resources/script/eligibility.js"></script>

</body>
</html>