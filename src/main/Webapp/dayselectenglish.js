/**
 * 
 */
function getDaysInMonth(year, month) {
  return new Date(year, month, 0).getDate();
}

 const engmonthSelect = document.getElementById('engmonth');
 const engyearSelect = document.getElementById('engyear');
 const engdaySelect = document.getElementById('engday');

 engmonthSelect.addEventListener('change', updateDays);
 engyearSelect.addEventListener('change', updateDays);

 function updateDays() {
	  const yeareng = engyearSelect.value;
	  console.log(yeareng)
	  const montheng = engmonthSelect.value;	 
	    console.log(montheng);
	  const engdaysInMonth = getDaysInMonth(yeareng, montheng);
	  console.log(engdaysInMonth);
	  
	  // Clear the current options of the day select element
	  engdaySelect.innerHTML = '';

	  // Generate the new options of the day select element
	  for (let i = 1; i <= engdaysInMonth; i++) {
	    const option = document.createElement('option');
	    option.value = i < 10 ? '0' + i : i;
	    option.text = i;
	    engdaySelect.add(option);
	    
	   
	  }
	}




