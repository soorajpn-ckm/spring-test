package com.sooraj.app.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sooraj.app.model.User;

@RestController
public class RegistrationController {
	
	public RegistrationController() {
		System.out.println(" controller created #############()##############");

	}
	
	@RequestMapping(  value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	  @ResponseBody
	public String saveRegistration(@ModelAttribute User user) {
		System.out.println(" register method #########tycc####("+user.getName()+")##############");

		return "jsp/login";
		
	}
	
	@GetMapping("/login")
	public ModelAndView viewLogin(User user) {
		
		System.out.println(" view login method #############()##############");
		ModelAndView mv=new ModelAndView("jsp/login");
		mv.addObject("user", new User());
		return mv;
		
	}
	
	@GetMapping("/SampleWebApp/login")
	public ModelAndView viewLogin2() {
		
		System.out.println(" view login2 method #############()##############");
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("user", new User());
		return mv;
		
	}

}
