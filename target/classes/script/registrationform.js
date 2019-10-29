 $("#myForm").submit(function (e) {
            var radioValue = $("input:radio[class='type_of_emp']:checked").val();
            var fname = $("#fname").val();
            var mname = $("#mname").val();
            var lname = $("#lname").val();
            var email = $("#email").val();
            var username = $("#user").val();
            var password = $("#pass1").val();
            var cnfrmpassword = $("#pass2").val();
            var dateofbirth = $("#dob").val();
            var phnumber = $("#phno").val();
            var nationality = $("#nation").val();
            var check = 0;


            //for radiobutton
            if(radioValue == undefined){
                alert("Please select gender!!!");
                chk = 0 ;
             }else{
                 chk = 1;
             }
            
            //for fname
            if (fname == "") {
                chk = 0;
                //alert("Please enter the Details!");
                $("#fname").focus();
                $('#fname').css("outline", "0");
                $('#fname').css("border-color", "red");
                $('#fname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".fname").show();

            }
            else if (!fname.replace(/\s/g, '').length) {
                chk = 0;
                //alert("Enter valid input !!!");
                $("#fname").focus();
                $('#fname').css("outline", "0");
                $('#fname').css("border-color", "red");
                $('#fname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(fname)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Firstname contains only Alphabets!!!");
                }
            }

            //for mname
            if (mname == "") {
                chk = 0;
                //alert("Enter valid input !!!");
                $("#mname").focus();
                $('#mname').css("outline", "0");
               // $('#mname').css("border-color", "red");
                $('#mname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".mname").show();

            }
            else if (!mname.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#mname").focus();
                $('#mname').css("outline", "0");
                $('#mname').css("border-color", "red");
                $('#mname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(mname)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Middlename contains only Alphabets!!!");
                }
            }

            //for lname
            if (lname == "") {
                chk = 0;

                $("#lname").focus();
                $('#lname').css("outline", "0");
                $('#lname').css("border-color", "red");
                $('#lname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".lname").show();

            }
            else if (!lname.replace(/\s/g, '').length) {
                chk = 0;
               // alert("Enter valid input !!!");
                $("#lname").focus();
                $('#lname').css("outline", "0");
                $('#lname').css("border-color", "red");
                $('#lname').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(lname)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Last name contains only Alphabets!!!");
                }
            }
            //for email
            if (email == "") {
                chk = 0;

                $("#email").focus();
                $('#email').css("outline", "0");
                $('#email').css("border-color", "red");
                $('#email').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".email").show();

            }
            else if (!email.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#email").focus();
                $('#email').css("outline", "0");
                $('#email').css("border-color", "red");
                $('#email').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/\S+@\S+\.\S+/.test(email)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter proper Email!!!");
                }
            }

              //for username
              if (username == "") {
                chk = 0;

                $("#user").focus();
                $('#user').css("outline", "0");
                $('#user').css("border-color", "red");
                $('#user').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".user").show();

            }
            else if (!username.replace(/\s/g, '').length) {
                chk = 0;
                //alert("Enter valid input !!!");
                $("#user").focus();
                $('#user').css("outline", "0");
                $('#user').css("border-color", "red");
                $('#user').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$/.test(username)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Username format Invalid!!!");
                }
            }

            //for password

            if(password.length<6){
                    chk = 0;
                    //alert("Password must be atleast 6 characters!!!");
                    $("#pass1").focus();
                    $('#pass1').css("outline","0");
                    $('#pass1').css("border-color","red");
                    $('#pass1').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".pass1").show();
                    
                    
                }
                if(password == ""){
                    chk = 0;
                    
                    $("#pass1").focus();
                    $('#pass1').css("outline","0");
                    $('#pass1').css("border-color","red");
                    $('#pass1').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".pass1").show();
                    
                }
                else if(!password.replace(/\s/g, '').length){
                    chk = 0;
                    alert("Enter valid input !!!");
                    $("#pass1").focus();
                    $('#pass1').css("outline","0");
                    $('#pass1').css("border-color","red");
                    $('#pass1').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                   
                }
                else{
                    if(/^(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$/.test(password))
                    {
                        chk = 1;   
                    }
                    else{
                        chk = 0;
                        alert("Enter proper Password!!!");
                    }
                }

                //for password and cnfrmpassword matching

                if (cnfrmpassword == password) {
                chk = 1;
                }else{
                chk = 0;
                alert("Passwords do not match!");
                $("#pass2").focus();
                $('#pass2').css("outline", "0");
                $('#pass2').css("border-color", "red");
                $('#pass2').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".pass2").show();

            }
            //for cnfrmpassword
            if (cnfrmpassword == "") {
                chk = 0;

                $("#pass2").focus();
                $('#pass2').css("outline", "0");
                $('#pass2').css("border-color", "red");
                $('#pass2').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".pass2").show();

            }
            else {
                if (/^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$/.test(pass2)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Incorrect password");
                }
            }

            //for ph no
            if (phnumber == "") {
                chk = 0;

                $("#phno").focus();
                $('#phno').css("outline", "0");
                $('#phno').css("border-color", "red");
                $('#phno').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".phno").show();

            }
            else if (!phnumber.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#phno").focus();
                $('#phno').css("outline", "0");
                $('#phno').css("border-color", "red");
                $('#phno').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[0-9\s]+$/.test(phnumber)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter numbers only!!!");
                }
            }

            //for dob
            if (dateofbirth == "") {
                chk = 0;

                $("#dob").focus();
                $('#dob').css("outline", "0");
                $('#dob').css("border-color", "red");
                $('#dob').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".dob").show();

            }
            else if (!dob.replace(/\s/g, '').length) {
                chk = 0;
                alert("Enter valid input !!!");
                $("#dob").focus();
                $('#dob').css("outline", "0");
                $('#dob').css("border-color", "red");
                $('#dob').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^(.{0,7}|[^0-9]*|[^A-Z]*|[^a-z]*|[a-zA-Z0-9]*)$/.test(dateofbirth)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Enter numbers only!!!");
                }
            }




             //for nationality
             if (nationality == "") {
                chk = 0;
                //alert("Please enter the Details!");
                $("#nation").focus();
                $('#nation').css("outline", "0");
                $('#nation').css("border-color", "red");
                $('#nation').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");
                $(".nation").show();

            }
            else if (!nationality.replace(/\s/g, '').length) {
                chk = 0;
                //alert("Enter valid input !!!");
                $("#nation").focus();
                $('#nation').css("outline", "0");
                $('#nation').css("border-color", "red");
                $('#nation').css("box-shadow", "inset 0px 0px 2px 1px #FE7364");

            }
            else {
                if (/^[a-zA-Z\s]+$/.test(nationality)) {
                    chk = 1;
                }
                else {
                    chk = 0;
                    alert("Nationality contains only Alphabets!");
                }
            }


            if (chk == 0) {
                e.preventDefault();
            }

        });
