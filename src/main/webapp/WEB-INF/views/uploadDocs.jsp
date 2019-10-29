<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload documents</title>
<link rel="stylesheet" href="../resources/css/form.css">
</head>
<body>
	<div class="logo">
		<img src="../reources/images/output-onlinepngtools.png">
	</div>

	<div class="img_container"></div>
	<div class="container">

		<form method="POST" action="uploadDocs" enctype="multipart/form-data">
			<div id="header1">
				<b><u>Upload Documents</u></b>
			</div>
			<div class="body">
				<div class="form_fiels">
					<div class="outer">
						<label class="form_lab  required">Pancard</label>
						<div class="inner">
							<input type="file" id="pancard" name="files"
								accept="pdf/*,image/*">
						</div>
					</div>

					<div class="outer">
						<label class="form_lab  required">Voter ID</label>
						<div class="inner">
							<input type="file" id="voter_id" name="files"
								accept="pdf/*,image/*">
						</div>
					</div>

					<div class="outer">
						<label class="form_lab  required">Salary Slip</label>
						<div class="inner">
							<input type="file" id="salary_slip" name="files"
								accept="pdf/*,image/*">
						</div>
					</div>

					<div class="outer">
						<label class="form_lab  required">LOA</label>
						<div class="inner">
							<input type="file" id="loa" name="files" accept="pdf/*,image/*">
						</div>
					</div>

					<div class="outer">
						<label class="form_lab  required">NOC from Builder</label>
						<div class="inner">
							<input type="file" id="noc" name="files" accept="pdf/*,image/*">
						</div>
					</div>

					<div class="outer">
						<label class="form_lab  required">Agreement To Sale</label>
						<div class="inner">
							<input type="file" id="agreement" name="files"
								accept="pdf/*,image/*">
						</div>
					</div>


				</div>
				<br />
				<div class="formaction">
					<div class="outer">
						<input type="submit" id="subBtn1" name="subBtn" value="Upload">
					</div>
				</div>
			</div>
		</form>
</body>
</html>