<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome to Bank!!!!!</title>
<link rel="stylesheet" href="../resources/css/form.css">

</head>
<body>
	<div class="logo">
		<img src="../resources/images/output-onlinepngtools.png">
	</div>


	<div class="container-login">
		<div class="wrapimg">
			<div class="img_container">
				<img src="../resources/images/download1.jpg">
			</div>
			<form id="myForm" action="login" method="post">
				<div id="loginheader">
					<b><u>User Login</u></b>
				</div>
				<div class="body">
					<div class="form_fiels">
						<div class="outer">
							<label class="form_lab required">Username: </label>
							<div class="inner">
								<div class="inner">
									<input type="text" id="user" name="username" autocomplete="off">
								</div>
								<div class="err_msg user">
									<span class="ex_mark">!</span>Enter Username
								</div>
							</div>
							<div class="err_msg">
								<span class="ex_mark">!</span>Enter Username!
							</div>
						</div>

						<div class="outer">
							<label class="form_lab  required">Password: </label>
							<div class="inner">
								<div class="inner">
									<input type="password" id="pass" name="password"
										autocomplete="off">
								</div>

								<div class="err_msg pass">
									<span class="ex_mark">!</span>Enter Password!
								</div>
								<div class="inner">
									<span id="icon">i</span>Password must be at least 6 characters
								</div>
								<div class="err_msg">
									<span class="ex_mark">!</span>Incorrect password
								</div>
							</div>

						</div>


						<div class="formaction">
							<div class="outer">
								<input type="submit" id="subBtn1" name="subBtn" value="Login" />
								<div class="inner">
									<span id="icon">&nbsp; &nbsp;Create a new Account<a
										href="#" class="link">Sign up here</a></span>
								</div>
								<div class="inner">
									<span id="icon">&nbsp; &nbsp;Forgot<a href="#"
										class="link"> Username/Password?</a></span>
								</div>
							</div>
						</div>
					</div>
				</div>
			</form>
</body>
</html>