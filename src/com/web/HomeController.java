package com.web;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/","/homepage"})
public class HomeController implements InitializingBean,DisposableBean{
	
	public HomeController() {
		/*System.out.println("Homecontroller--Constructor()");*/
	}

	@RequestMapping(method=RequestMethod.GET)
	public String home(){
		return "home";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("HomeController--destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("HomeController--afterPropertiesSet()");
		
	}

}
