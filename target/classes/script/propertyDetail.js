 $("#myForm").submit(function(e){
                var prop_name = $("#property_loc").val();
                var prop_loc = $("#property_loc").val();
                var estimate_amt = $("#estimate_amt").val();
                if(prop_name == "" || phone_num == "" || pass == ""){
                    $("#property_loc").focus();
                    $('#property_loc').css("outline","0");
                    $('#property_loc').css("border-color","#fe8d80");
                    $('#property_loc').css("box-shadow","inset 0px 0px 2px 1px #fe8d80");


                    $('#property_name').css("outline","0");
                    $('#property_name').css("border-color","#fe8d80");
                    $('#property_name').css("box-shadow","inset 0px 0px 2px 1px #fe8d80");

                   
                    $('#estimate_amt').css("outline","0");
                    $('#estimate_amt').css("border-color","#fe8d80");
                    $('#estimate_amt').css("box-shadow","inset 0px 0px 2px 1px #fe8d80");

                    $(".err_msg").show();

                    e.preventDefault();
                }
            });
     