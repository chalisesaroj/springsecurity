package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Adddaystodate {
	 public static String addDaysToEnglishDate(String toadddate, int day) {
	        // Set the initial date
	        LocalDate date = LocalDate.parse(toadddate);
	        
	        // Add the specified number of days to the initial date
	        LocalDate newDate = date.plusDays(day);
	        
	        // Format the new date as a string in the ISO date format
	        String addeddate = newDate.format(DateTimeFormatter.ISO_DATE);
	        
	        // Return the new date as a string
	        return addeddate;
	    }
	 
	 
	 public static String addDaysToNepaliDate(String date, int day) {
			
		String[] nepalidateArray1 = date.split("-");
			
			int nepYear=Integer.parseInt(nepalidateArray1[0]);
			int nepMonth=Integer.parseInt(nepalidateArray1[1]);
			int nepDay=Integer.parseInt(nepalidateArray1[2]);
			int dayOfWeek = Calendar.SATURDAY;
		
			while (day != 0) {

			      // getting the total number of days in month nepMonth in year nepYear    
			      int daysInIthMonth =Nepalidatedatabase.
			    		  data().get(nepYear)[nepMonth] ;

			      nepDay++; // incrementing nepali day

			      if (nepDay > daysInIthMonth) {
			            nepMonth++;
			            nepDay = 1;
			      }
			      if (nepMonth > 12) {
			            nepYear++;
			            nepMonth = 1;
			      }

			      dayOfWeek++; // count the days in terms of 7 days
			      if (dayOfWeek > 7) {
			            dayOfWeek = 1;
			      }

			     day--;
			}
			String addedDate=nepYear+"-"+nepMonth+"-"+nepDay;
			return addedDate;
			
			
			

}
}
