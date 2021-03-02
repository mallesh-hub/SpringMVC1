package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {
	
	
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model)
	{
		//String Myname="mallesh";
		
		//model.addAttribute("MyNameValue",Myname);
		//model.addAttribute("MyWebsiteTittle","MOM,S Cafe");
		
		return "welcome-page";
		
	}
	
	
	@RequestMapping("/processorder")
	public String processOreder(HttpServletRequest req,Model model)
	{
	String userenteredvalue=	req.getParameter("foodtype");
	model.addAttribute("userinput",userenteredvalue);
		
		return "process-order";
		
	}
	
	@RequestMapping("/book")
	public String showMybook()
	{
		return "view-book";
		
	}
	
	@RequestMapping("/orderbook")
	public String orderBook()
	{
		return "order-book";
		
	}

}
