package com.web;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dao.SpitterDao;

import spittr.Spitter;


@Controller
@RequestMapping({"/spitter"})
public class SpitterController implements InitializingBean , DisposableBean{
	@Autowired(required=false)
	private SpitterDao sprdao;
	
	@Autowired HttpSession sess;
	
	private static final org.slf4j.Logger log=LoggerFactory.getLogger(Spitter.class.getName());
	
	


	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String showRegistrationForm(Model model){
		model.addAttribute(new Spitter());
		return "registerForm";
	}

	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String processRegistration(@Valid Spitter spitter,Errors errors){
		System.out.println(spitter.getUserName()+spitter.getFirstName()+spitter.getLastName());
		if(errors.hasErrors()){
			System.out.println("Error: ");
			return "registerForm";
		}
		sprdao.SaveSpitter(spitter);
		log.info("Spitter registered : "+spitter.getId());
		System.out.println("Spitter ID: "+spitter.getId());
		return "redirect:/";
	}
	
	@RequestMapping(value="/{username}")
	public String showUserProfile(@PathVariable String username,Model model){
		model.addAttribute("username",username);
		return "profile";
	}
	
	@RequestMapping(value="showlogin",method=RequestMethod.GET)
	public String showLogin(Model model){
		model.addAttribute(new Spitter());
		return "loginpage";
	}
	
	@RequestMapping(value="showlogin",method=RequestMethod.POST)
	public String dologin(Spitter spitter,RedirectAttributes model){
		Spitter newSpitter=sprdao.findSpitter(spitter);
		if(newSpitter.getId()> (-1)){
			sess.setAttribute("spitterLogged", "loggedin");
			sess.setAttribute("spitter", newSpitter);
			/*model.addFlashAttribute("spitter",spitter);*/
			model.addAttribute("username",spitter.getUserName());
			return "redirect:/spitter/{username}";
		}
		else{
			return "redirect:/spitter/showlogin";
		}
	}
	
	@RequestMapping(value="logout")
	public String dologout(){
		sess.invalidate();
		log.info("user logged out");
		return "redirect:/spitter/showlogin";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("spitterController--destroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("spitterController--afterPropertiesSet()");
		
	}
	
	
	
}
