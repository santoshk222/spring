package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping({"/spittle"})
public class SpittleController {
	/*private SpittleRepository spittleReopsitory;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleReopsitory=spittleRepository;
	}*/
	
	@RequestMapping(value="/showspittles",method=RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute(new Object());
		return "spittles";
	}

}
