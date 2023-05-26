package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homepage() {
		
		return "mainpage.jsp";
		
	}

	 
    @RequestMapping("/view") 
    public String view()
    {
        return "view.jsp";
    }
	    @RequestMapping("/delete") 
	    public String delete()
	    {
	        return "delete.jsp";
	    }
	    @RequestMapping("/update") 
	    public String update()
	    {
	        return "update.jsp";
	    }
	
	

}
