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
loanamt=loanamt==null?"50000":loanamt;
 loanperiod=loanperiod==null?"5":loanperiod;
 lpm=lpm==null?"0":lpm;
 interestrate=interestrate==null?"16":interestrate;
		double Dloanamt=Double.parseDouble(loanamt);
		double Dloanperiod=Double.parseDouble(loanperiod);
		double Dlpm=Double.parseDouble(lpm);
		double Dinterestrate=Double.parseDouble(interestrate);
		String[][]detailcalculation=calculator.detailcalculation(Dloanamt,Dloanperiod,Dlpm,Dinterestrate);
		session.setAttribute("detailvalue", detailcalculation);
		session.setAttribute("loanamt", loanamt);
		session.setAttribute("loanperiod", loanperiod);
		session.setAttribute("lpm", lpm);
		session.setAttribute("interestrate", interestrate);
		
		return "emicalculator.jsp";
		
	}

}
