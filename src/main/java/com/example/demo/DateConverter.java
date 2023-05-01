package com.example.demo;

public class DateConverter {
	public static String EnglishtoNepaliDate(String Englishdate) {
		long daydiff=DateDifffinder.findEnglishdatediff("1944-01-01",Englishdate);
		int Daydiff=(int)(daydiff);
		String NepaliDate=Adddaystodate.addDaysToNepaliDate("2000-09-17", Daydiff);
		String formatexp= " YYYY-MM-DD  Format";
		return NepaliDate+"  :     "+formatexp;
		
	}
	public static String nepaliToEnglishDate(String Nepalidate) {
		int daydiff=DateDifffinder.findnepalidiff("2000-09-17",Nepalidate);
		String NepaliDate=Adddaystodate.addDaysToEnglishDate("1944-01-01", daydiff);
		String formatexp= " YYYY-MM-DD  Format";
		return NepaliDate+" :      "+formatexp;
		
	}
}
