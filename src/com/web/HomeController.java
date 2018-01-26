package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController {
	
	public HomeController() {
		System.out.println("homecontroller.class");
	}

	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "home";
	}

}
