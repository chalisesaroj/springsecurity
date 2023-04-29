package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateDifffinder {
	
	 public static int findnepalidiff(String nepalidate1, String nepalidate) {
			String[] nepalidateArray = nepalidate.split("-");
			String[] nepalidateArray1 = nepalidate1.split("-");
			
			int refdateyear=Integer.parseInt(nepalidateArray1[0]);
			int refdatemonth=Integer.parseInt(nepalidateArray1[1]);
			int refdateday=Integer.parseInt(nepalidateArray1[2]);
			int nepalidateyear=Integer.parseInt(nepalidateArray[0]);
			int nepalidatemonth=Integer.parseInt(nepalidateArray[1]);
			int nepalidateday=Integer.parseInt(nepalidateArray[2]);
			int count=0;
			while(!(refdateyear==nepalidateyear&&
					refdatemonth==nepalidatemonth&&
					refdateday==nepalidateday)) {
				count++;
				int daysInIthMonth = 
						Nepalidatedatabase.data().get(refdateyear)[refdatemonth];

				refdateday++;

			
				if (refdateday > daysInIthMonth) {
			
		            refdatemonth++;
		            refdateday = 1;
		      }
		      if (refdatemonth > 12) {
		            refdateyear++;
		           refdatemonth=1;
		      }

			}
			System.out.println("the count is"+count);
			return count;
		}
		
	 public static long findEnglishdatediff(String date1,String date2) {
  
	            DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	            LocalDate datefirst = LocalDate.parse(date1, format);
	            LocalDate datesecond = LocalDate.parse(date2, format);
	       
	            long difference = ChronoUnit.DAYS.between(datefirst, datesecond); 
	         
	            System.out.println("Difference in days: " + difference);
	      
			return difference;
	    }
}
