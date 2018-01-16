package com.boto.onlineshop.contrroler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boto.onlineshopbackend.dao.CategoryDao;
import com.boto.onlineshopbackend.dto.Category;

@Controller
public class PageContrroller {
	
	

	@Autowired
	private CategoryDao categoryDao ; 
	@RequestMapping(value={"/","/home","/index"})
	public String index(ModelMap model){
		//passing list of catogery
		
		model.addAttribute("catogeries", categoryDao.list());
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
	
	/*
	 * method to load all products
	 * */

	@RequestMapping(value="/show/all/products")
	public String showAllProducts(ModelMap model){
		//passing list of catogery
		
		model.addAttribute("catogeries", categoryDao.list());
		model.addAttribute("title", "all Products");
		model.addAttribute("isAllProducts", true);
		return "page";
	}
	
	
	
	@RequestMapping(value="/show/catogery/{id}/products")
	public String showCatogeryProducts(@PathVariable("id") int id , ModelMap model){
		/*
		 * get catogery id
		 * */
		
		Category category =null;
		category= categoryDao.getbyid(id);
		
		model.addAttribute("catogeries", categoryDao.list());
		model.addAttribute("category", category);
		model.addAttribute("title", category.getName() );
		model.addAttribute("isCategoryProducts", true);
		return "page";
	}
	
}
