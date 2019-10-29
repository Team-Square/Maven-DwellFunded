function EmiCalculator(){
      
    var month = $("#emiMonth").val();
    var pamt = $("#prncipleAmount").val();
    
     var monthlyInterestRatio = (8.5/100)/12;
     var monthlyInterest = (monthlyInterestRatio*pamt);
        var top = Math.pow((1+monthlyInterestRatio),month);
           var bottom = top -1;
           var sp = top / bottom;
           var emi1 = ((pamt * monthlyInterestRatio) * sp);
     var result = emi1.toFixed(2);
     $("#emi").val(result);
      
  }