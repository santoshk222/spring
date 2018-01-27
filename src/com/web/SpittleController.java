package com.web;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.SpittleDao;

import spittr.data.SpittleRepository;

@Controller
@RequestMapping({"/spittle"})
public class SpittleController implements InitializingBean, DisposableBean{
	@Autowired(required=false)
	private SpittleDao splDao;
	
	
	@RequestMapping(value="/showspittles",method=RequestMethod.GET)
	public String spittles(Model model){
		model.addAttribute(new Object());
		return "spittles";
	}


	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("SpittleController--destroy()");		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("SpittlecController--afterPropertiesSet()");		
	}
	
	
	
	
/*private SpittleRepository spittleReopsitory;
	
	@Autowired
	public SpittleController(SpittleRepository spittleRepository) {
		this.spittleReopsitory=spittleRepository;
	}*/

}
