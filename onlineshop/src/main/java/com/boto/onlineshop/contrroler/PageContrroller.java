package com.boto.onlineshop.contrroler;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boto.onlineshop.exception.ProductNotFoundException;
import com.boto.onlineshopbackend.dao.CategoryDao;
import com.boto.onlineshopbackend.dao.ProdeuctDao;
import com.boto.onlineshopbackend.dto.Category;
import com.boto.onlineshopbackend.dto.Prodeuct;


@Controller
public class PageContrroller {
	private static final Logger logger =  LoggerFactory.getLogger(PageContrroller.class);
	@Autowired
	private CategoryDao categoryDao ; 
	@Autowired
	private ProdeuctDao  prodeuctDao;
	
	@RequestMapping(value={"/","/home","/index"})
	public String index(ModelMap model){
		
		logger.info("inside pageController Home Method - INFO ");
		logger.debug("inside pageController Home Method - DEBUG ");
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
	public String showCatogeryProducts(@PathVariable("id") int id , ModelMap model)  {
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
	
	
	
	
	/*
	 * 
	 * Request Mapping for Single Product Page
	 * */
	@RequestMapping(value="/show/{id}/product")
	public String singleProductPage(@PathVariable int id , ModelMap model)throws ProductNotFoundException {
		Prodeuct prodeuct = prodeuctDao.getProdeuctById(id);
		
		if(prodeuct == null) throw new ProductNotFoundException();
		
		//update the view
		prodeuct.setViews(prodeuct.getViews()+1);
		prodeuctDao.update(prodeuct);
		//____________________________________________
		
		model.put("title", prodeuct.getName());
		model.put("product", prodeuct);
		model.put("isViewProduct", true);
		
		
		return "page";
	}
	
}
