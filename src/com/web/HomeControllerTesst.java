package com.web;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HomeControllerTesst {
	@Test
	public void testHomePage() throws Exception{
		HomeController controller=new HomeController();
		/*MockMvc mockmvc=standaloneSetup(controller).build();
		mockmvc.perform(get("/")).andExpect(view().name("home"));
*/		/*assertEquals("home",controller.home());*/
	}

}
