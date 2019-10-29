
    $("#myForm").submit(function(e){
        var username = $("#user").val();
        var password  = $("#pass").val();
        var check=0;

        if(username == ""){
        chk = 0;
        
        $("#user").focus();
        $('#user').css("outline","0");
        $('#user').css("border-color","red");
        $('#user').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
        $(".user").show();
        
    }
    else if(!username.replace(/\s/g, '').length){
        chk = 0;
        alert("Enter valid input !!!");
        $("#user").focus();
        $('#user').css("outline","0");
        $('#user').css("border-color","red");
        $('#user').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
       
    }
    else{
        if(/^[a-zA-Z0-9\s]+$/.test(username))
        {
            chk = 1;   
        }
        else{
            chk = 0;
            alert("Enter proper Username!!!");
        }
    }


    if(password.length<6){
        chk = 0;
        //alert("Password must be atleast 6 characters!!!");
        $("#pass").focus();
        $('#pass').css("outline","0");
        $('#pass').css("border-color","red");
        $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
        $(".pass").show();
        
    }

    if(password == ""){
        chk = 0;
        
        $("#pass").focus();
        $('#pass').css("outline","0");
        $('#pass').css("border-color","red");
        $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
        $(".pass").show();
        
    }
    else if(!password.replace(/\s/g, '').length){
        chk = 0;
        alert("Enter valid input !!!");
        $("#pass").focus();
        $('#pass').css("outline","0");
        $('#pass').css("border-color","red");
        $('#pass').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
       
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

            
    if(chk == 0){
            e.preventDefault();
        }
   
});