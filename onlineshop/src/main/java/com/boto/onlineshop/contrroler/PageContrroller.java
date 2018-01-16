package com.boto.onlineshop.contrroler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageContrroller {

	@RequestMapping(value={"/","/home","/index"})
	public String index(ModelMap model){
		model.addAttribute("title", "home");
		model.addAttribute("ishome", true);
		return "page";
	}
	
	
	@RequestMapping(value={"/about"})
	public String about(ModelMap model){
		model.addAttribute("title", "about");
		model.addAttribute("isabout", true);
		return "page";
	}
	
	
	@RequestMapping(value={"/contact"})
	public String contact(ModelMap model){
		model.addAttribute("title", "contact");
		model.addAttribute("iscontact", true);
		return "page";
	}
	

}
