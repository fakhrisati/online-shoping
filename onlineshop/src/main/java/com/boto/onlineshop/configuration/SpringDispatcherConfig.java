package com.boto.onlineshop.configuration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class SpringDispatcherConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext Contianer =	new AnnotationConfigWebApplicationContext();
		Contianer.register(SpringConfig.class);
		Contianer.setServletContext(servletContext);
		Dynamic servlet = servletContext.addServlet("spring",new DispatcherServlet(Contianer));
		servlet.addMapping("/");
		servlet.setLoadOnStartup(1);
		
	}
	

}
