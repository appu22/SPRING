package com.xworkz.mobile2.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class MobileController {

	public MobileController() {
		System.out.println(this.getClass().getSimpleName() + ": Object created ");
	}

	
	@RequestMapping(value="/mobile.do") //form action name 
	public String  onSubmit(@RequestParam String mn, @RequestParam String pr, @RequestParam String ram
			, Model model)//model interface an object binding data
	{
		System.out.println("Invoking  Onsubmit ");
		model.addAttribute("ResponceMeassage","Thank you..! Visit again..! "
				+ "selected item :  "+mn +" "+pr+" "+ram);
		//adding data using addAttribute(key, value)
		
//		return "/mobile.jsp";
		return "/WEB-INF/MobileResponce.jsp"; //responce page // web-inf 
		
		
	}

}
