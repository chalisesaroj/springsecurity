package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homepage() {
		
		return "homepage.jsp";
		
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

}
