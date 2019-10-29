  //validation script

            $("#myForm").submit(function(e){

                var radioValue = $("input:radio[class='type_of_emp']:checked").val();
                var retire_age = $("#retire_age").val();
                var org_type = $("#org_type").val();
                var emp_name = $("#emp_name").val();
                var chk = 0;
                //radio button validation
                if(radioValue == undefined){
                   alert("Please select type of employment!!!");
                   chk = 0 ;
                }else{
                    chk = 1;
                }

                //retire age validation
                if(retire_age == ""){
                    chk = 0;
                    //alert("Please enter organization type !!!");
                    $("#retire_age").focus();
                    $('#retire_age').css("outline","0");
                    $('#retire_age').css("border-color","red");
                    $('#retire_age').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".retire_age").show();
                    
                }
                else if(!retire_age.replace(/\s/g, '').length){
                    chk = 0;
                    alert("Enter valid input !!!");
                    $("#retire_age").focus();
                    $('#retire_age').css("outline","0");
                    $('#retire_age').css("border-color","red");
                    $('#retire_age').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                   
                }
                else{
                      if(/^[0-9\s]+$/.test(retire_age))
                {
                    chk = 1;
                }
                else{
                    chk = 0;
                    alert("Retire Age should be in Numbers");
                    $("#retire_age").focus();
                    $('#retire_age').css("outline","0");
                    $('#retire_age').css("border-color","red");
                    $('#retire_age').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".retire_age").show();
                }
                }

                //organization type validation
                if(org_type == ""){
                    chk = 0;
                    //alert("Please enter organization type !!!");
                    $("#org_type").focus();
                    $('#org_type').css("outline","0");
                    $('#org_type').css("border-color","red");
                    $('#org_type').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".org_type").show();
                    
                }
                else if(!org_type.replace(/\s/g, '').length){
                    chk = 0;
                    alert("Enter valid input !!!");
                    $("#org_type").focus();
                    $('#org_type').css("outline","0");
                    $('#org_type').css("border-color","red");
                    $('#org_type').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                   
                }
                else{
                    if(/^[a-zA-Z\s]+$/.test(org_type))
                    {
                        chk = 1;
                    }
                    else{
                        chk = 0;
                        alert("Organization type contains Alphabets only!!!");
                    }
                }
                

                //employer name validation
                if(emp_name == ""){
                    chk = 0;
                    //alert("Please enter organization type !!!");
                    $("#emp_name").focus();
                    $('#emp_name').css("outline","0");
                    $('#emp_name').css("border-color","red");
                    $('#emp_name').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                    $(".emp_name").show();
                    
                }
                else if(!org_type.replace(/\s/g, '').length){
                    chk = 0;
                    alert("Enter valid input !!!");
                    $("#emp_name").focus();
                    $('#emp_name').css("outline","0");
                    $('#emp_name').css("border-color","red");
                    $('#emp_name').css("box-shadow","inset 0px 0px 2px 1px #FE7364");
                   
                }
                else{
                    if(/^[a-zA-Z\s]+$/.test(emp_name))
                    {
                        chk = 1;
                    }
                    else{
                        chk = 0;
                        alert("Employee name contains Alphabets only!!!");
                    }
                }
                

              
                    if(chk == 0){
                        e.preventDefault();
                    }
               
            });
     
   