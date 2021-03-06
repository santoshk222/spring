package com.config;

import javax.inject.Scope;
import javax.servlet.MultipartConfigElement;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.dao.SpitterDao;
import com.dao.SpittleDao;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.dao","com.web"})
public class WebConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/jsp/");
		resolver.setSuffix(".jsp");
		resolver.setExposeContextBeansAsAttributes(true);
		return resolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();		
	}
	
	@Bean
	public SpitterDao spdao(){
		return	new SpitterDao();
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public SpittleDao spldao(){
		return new SpittleDao();
	}
	
	/*@Bean
	public MultipartResolver multipartResolver(){
		return new StandardServletMultipartResolver();
	}*/
	
	

}
