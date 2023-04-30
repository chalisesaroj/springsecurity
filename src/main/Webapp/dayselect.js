/**
 * 
 */
function generateDays() {
  var month = document.getElementById("month").value;
  var days = document.getElementById("day");
  days.options.length = 0;
  if (month === "") {
    var defaultOption = document.createElement("option");
    defaultOption.text = "Select Day";
    days.add(defaultOption);
  } else {
    var daysInMonth = new Date(2023, month, 0).getDate();
    for (var i = 1; i <= daysInMonth; i++) {
      var option = document.createElement("option");
      option.value = i;
      option.text = i;
      days.add(option);
    }
  }
}




