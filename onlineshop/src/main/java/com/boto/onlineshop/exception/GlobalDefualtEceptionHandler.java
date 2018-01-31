package com.boto.onlineshop.exception;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefualtEceptionHandler {
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public String noHandlerFoundExceptin(Model model){
		model.addAttribute("erorrTitle", "This page is not construccted!");
		model.addAttribute("erorrDescription", "This page you are looking for is not availble now!");
		model.addAttribute("title", "404 Erorr Page");
		return "erorr";
		
	}

	
	@ExceptionHandler(ProductNotFoundException.class)
	public String HandlerProductFoundExceptin(Model model){
		model.addAttribute("erorrTitle", "Product not available!");
		model.addAttribute("erorrDescription", "This Product you are looking for is not availble right now!");
		model.addAttribute("title", "Product unavailable!");
		return "erorr";
		
	}
	
	@ExceptionHandler(Exception.class)
	public String HandleExceptin(Model model, Exception ex){
		model.addAttribute("erorrTitle", "Contact your Administrator!");
		model.addAttribute("erorrDescription", ex.toString()+"Be ensure that your providng the correct Link ");
		model.addAttribute("title", "erorr!");
		return "erorr";
		
	}
	
	
}
