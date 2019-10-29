<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test</title>
</head>
<body>
Welcome to test program !!!!
 <div class="logo">
            <img src="C:\Users\AE206_PC17\Desktop\Team_Square(demo)\download.png" >
        </div>
    
  
	<div class="container">
           
            <form id="myForm">
            <div id="header1"><b><u>Forgot Password</u></b></div>
            <div class="body">
                <div class="form_fiels">
                   

                

                            <div class="outer"><label class="form_lab  required"> New Password: </label>
                                <div class="inner">
                                    <div class="inner"><input type="password" id="pass1"  name="passwd"   autocomplete="off"></div>
        
        
                                    <div class="inner"><span id="icon">i</span>Password must be at least 6 characters</div>
                                    
                                    
                                    <div class="err_msg"><span class="ex_mark">!</span>Incorrect password</div> 
                                </div>
                            <div>
                

                                    <div class="outer"><label class="form_lab  required"> Confirm Password: </label>
                                        <div class="inner">
                                            <div class="inner"><input type="password" id="pass2"  name="passwd"   autocomplete="off"></div>
                
                
                                            <div class="inner"><span id="icon">i</span>Password must be at least 6 characters</div>
                                            
                                            
                                            <div class="err_msg"><span class="ex_mark">!</span>Incorrect password</div> 
                                        </div>
                                    <div>
                        
				</div>
                </div>


                    <div class="formaction">
                        <div class="outer">
                            <input type="submit" id="subBtn1" name="subBtn" value="Submit">
                            
                           
                           <!-- <a href="#" class="previous round">&#8249;</a>
                            <a href="./admin.html" class="next round">&#8250;</a>-->
                        
                        </div>
                        </div>
                   

       
    
                </div>
                
            </div>
		</form>
    </div>

     <!--script src link for jquery and ajax-->
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
     <script>
        $("#myForm").submit(function(e){
                   
                    var password  = $("#pass").val();
                    var newpassword =$("#pass1").val();
                    var cnfrmpassword = $("#pass2").val();

                    var check=0;

                    if(password == ""){
                    chk = 0;
                    $("#pass").focus();
                    $('#pass').css("outline","0");
                    $('#pass').css("border-color","red");
                    $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".pass").show();
                    
                }
                else{
                    if(/^[A-Za-z!@#$%^&*0-9]{6,16}$/.test(pass))
                    {
                        chk = 1;
                    }
                    else{
                        chk = 0;
                        alert("Your password is incorrect");
                    }
                }


                
                if(password == ""){
                    chk = 0;
                    $("#pass1").focus();
                    $('#pass1').css("outline","0");
                    $('#pass1').css("border-color","red");
                    $('#pass1').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".pass1").show();
                    
                }
                else{
                    if(/^[A-Za-z!@#$%^&*0-9]{6,16}$/.test(pass))
                    {
                        chk = 1;
                    }
                    else{
                        chk = 0;
                        alert("Your password is incorrect");
                    }
                }

                
                if(password == ""){
                    chk = 0;
                    $("#pass2").focus();
                    $('#pass2').css("outline","0");
                    $('#pass2').css("border-color","red");
                    $('#pass2').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".pass2").show();
                    
                }
                else{
                    if(/^[A-Za-z!@#$%^&*0-9]{6,16}$/.test(pass))
                    {
                        chk = 1;
                    }
                    else{
                        chk = 0;
                        alert("Your password is incorrect");
                    }
                }
                        
                if(chk == 0){
                        e.preventDefault();
                    }
               
            });
                </script>
</body>
</html>