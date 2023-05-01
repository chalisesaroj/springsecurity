package com.example.demo;

import org.springframework.stereotype.Controller;
import com.example.demo.calculator;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homepage() {
		
		return "mainpage.jsp";
		
	}
	@RequestMapping("englishtonepalidateconvert")
	public String ADTOBS(String engyear,String engmonth,String engday, HttpSession session) {
		String englishdate=String.join("-",engyear,engmonth,engday);
		String nepalidate=DateConverter.EnglishtoNepaliDate(englishdate);
		session.setAttribute("nepalidate", nepalidate);
		return "homepage.jsp";
		
	}
	
	@RequestMapping("nepalitoenglishdateconvert")
	public String BSTOAD(String nepyear,String nepmonth,String nepday, HttpSession session) {
		String nepalidate=String.join("-",nepyear,nepmonth,nepday);
		String englishdate=DateConverter.nepaliToEnglishDate(nepalidate);
		session.setAttribute("englishdate", englishdate);
		System.out.println("english date is"+englishdate);
		return "homepage.jsp";
		
	}
	
	@RequestMapping("emicalculator")
	public String EMICALCULATOR(String loanamt,String loanperiod,String lpm,String interestrate, HttpSession session) {
		double loanamount=Double.parseDouble(loanamt);
		double Loanperiod=Double.parseDouble(loanperiod);
		double LPM=Double.parseDouble(lpm);
		double Interestrate=Double.parseDouble(interestrate);
		String[][]detailcalculation=calculator.detailcalculation(loanamount,Loanperiod,LPM,Interestrate);
		session.setAttribute("detailvalue", detailcalculation);
		return "emicalculator.jsp";
		
	}

}
