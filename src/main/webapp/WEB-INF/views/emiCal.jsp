<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	 <link rel="stylesheet" href="../resources/css/form.css">
</head>
<body>
			<div class="logo">
                <img src="C:\Users\AE206_PC17\Downloads\output-onlinepngtools.png" >
            </div>
        
    <div class="img_container">
    </div>
    <div class="container">
        <form id="myForm" action="" method="post">
            <div id="header5"><b><u>EMI CALCULATOR</u></b></div>
            <div class="body">
                <div class="outer"><label class="form_lab required">Loan Amount</label>
                    <div class="inner"><input type="text" id="prncipleAmount" name="prncipleAmount" placeholder="Enter your loan amount"></div>
                </div>
                <div class="outer"><label class="form_lab required">Tenure</label>
                    <div class="inner"><input type="text" id="emiMonth" name="emiMonth" placeholder="Enter Period"></div>
                </div>

                <div class="outer"><label class="form_lab required">Rate Of Interest</label>
                    <div class="inner"><input type="text" name="InterestRate" id="InterestRate" value="8.5%" disabled="disabled"></div>
                </div>
                <div class="outer">
                    <input type="button" id="subBtn1" name="subBtn" value="Calculate" onclick="EmiCalculator();">
                </div>
                <div class="outer"><label class="form_lab required">EMI</label>
                    <div class="inner"><input type="text" name="emi" id="emi"> </div>
                </div>
            </div>
            
        </form>
        
    </div>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="emicalculator.js"></script>

</body>
</html>