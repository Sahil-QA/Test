package com.mindtree.pegd014.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	
	@RequestMapping("/home")
	public String homePage() {	
		return "home";
	}

//	@RequestMapping(path="/processdata", method = RequestMethod.POST)
//	public String welcomeUser(@RequestParam("name") String name, 
//			@RequestParam("email") String email,
//			@RequestParam("company") String company) {
//		
//		userName = name;
//		System.out.println("User Name: "+name);
//		System.out.println("Email: "+ email);
//		System.out.println("Company Name: "+ company);
//		return "submit";
//	}
	
	@RequestMapping(path="/processdata", method = RequestMethod.POST)
	public ModelAndView showName(@RequestParam("name") String name, 
			@RequestParam("email") String email,
			@RequestParam("company") String company) {
		
		
		System.out.println("User Name: "+name);
		System.out.println("Email: "+ email);
		System.out.println("Company Name: "+ company);
		System.out.println("Data Printed");
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("name", name);
		modelAndView.addObject("email", email);
		modelAndView.addObject("company", company);
		
		modelAndView.setViewName("welcome");
		
		return modelAndView;
	}
}
