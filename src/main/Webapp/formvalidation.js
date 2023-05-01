/**
 * 
 */
function validateADtoBSForm() {
  var engYear = document.getElementById("engyear").value;
  var engMonth = document.getElementById("engmonth").value;
  var engDay = document.getElementById("engday").value;

  if (engYear == "") {
    alert("Please select a year");
    return false;
  }

  if (engMonth == "") {
    alert("Please select a month");
    return false;
  }

  if (engDay == "") {
    alert("Please select a day");
    return false;
  }

  return true;
}
