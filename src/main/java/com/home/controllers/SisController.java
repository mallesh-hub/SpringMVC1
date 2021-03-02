package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String getMakeupkit() {
		return "Hey!...take it my makupkit";
		
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks()
	{
		return "take it my book";
		
	}

}
