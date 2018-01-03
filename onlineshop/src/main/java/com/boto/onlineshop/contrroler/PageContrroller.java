package com.boto.onlineshop.contrroler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageContrroller {

	@RequestMapping(value={"/","/home","/index"})
	public String index(Model model){
		model.addAttribute("greting", "Hello");
		return "page";
	}
//	@RequestMapping(value="/test")
//	public String test(Model model, @RequestParam(value="greeting", required=false) String greeting ){
//		model.addAttribute("greting", greeting);
//		return "page";
//		
//	}
	
	@RequestMapping(value="/test/{greeting}")
	public String test(Model model, @PathVariable String greeting ){
		model.addAttribute("greting", greeting);
		return "page";
		
	}
}
