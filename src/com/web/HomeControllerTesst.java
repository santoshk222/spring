package com.web;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.junit.Assert.assertEquals;

public class HomeControllerTesst {
	@Test
	public void testHomePage() throws Exception{
		HomeController controller=new HomeController();
		MockMvc mockmvc=standaloneSetup(controller).build();
		mockmvc.perform(get("/")).andExpect(view().name("home"));
		/*assertEquals("home",controller.home());*/
	}

}
