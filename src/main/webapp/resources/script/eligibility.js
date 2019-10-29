function Eligibility(){
    var monthincome = $("#month").val();
    //var r=8.5/14;
    var eli=(60*(0.6*monthincome));
    var result = eli.toFixed();
    $("#emi").val(result);
}
