package com.boto.onlineshopbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.boto.onlineshopbackend.dao.ProdeuctDao;
import com.boto.onlineshopbackend.dto.Prodeuct;

public class prodeuctTestCase {

	private static AnnotationConfigApplicationContext context;
	private static ProdeuctDao prodeuctDao;
	private Prodeuct prodeuct;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("com.boto.onlineshopbackend");
		context.refresh();
		prodeuctDao = (ProdeuctDao) context.getBean("prodeuctDao");

	}

	
	
/* Testing Add method
	@Test
	public void AddCategory() {
		prodeuct = new Prodeuct();
		prodeuct.setId(2);
		prodeuct.setName("Iphone 6");
		prodeuct.setBrand("Apple");
		prodeuct.setDescription("Good");
		prodeuct.setActive(true);
		prodeuct.setUintPrice(70680d);
		prodeuct.setQuntity(20);
		prodeuct.setSipplierId(2);
		prodeuct.setCategoryId(1);
		assertEquals("Seccefully Added Prodeuct", true, prodeuctDao.add(prodeuct));
	 } */
	
	
	
	
/* testing getBy Id method and update Method
	@Test
	public void getCategory() {

		prodeuct = prodeuctDao.getProdeuctById(1);
		prodeuct.setName("Satalite110");
		assertEquals("Seccefully update   Prodeuct", true, prodeuctDao.update(prodeuct));

	}*/
	
	
	/*  Testing Delete method
	@Test
	public void getCategory() {

		prodeuct = prodeuctDao.getProdeuctById(3);
		assertEquals("Seccefully delete   Prodeuct", true, prodeuctDao.delete(prodeuct));
		}*/
	
	
	
	
	/*  Testing findAll method 
	
	@Test
	public void list(){
		assertEquals("Seccefully Fetch all  Prodeuct", 2, prodeuctDao.FindAllProdeuct().size());
		
	}*/
	
	
	
	
	

//
//	@Test
//	public void activeList(){
//		assertEquals("Seccefully Fetch all  Prodeuct", 2, prodeuctDao.ListActiveProdeuct().size());
//		
//	}  
	

	
	
//	 
//	@Test
//	public void activeListByCategiryId(){
//		assertEquals("Seccefully Fetch all  Prodeuct", 1, prodeuctDao.ListActiveProdeuctByCategory(2).size());
//		
//	}
//	
	
//	@Test
//	public void activeListByCategiryId(){
//		assertEquals("Seccefully Fetch all  Prodeuct", 1, prodeuctDao.getLatsetActiveProdeucts(2));
//                                   
//	}
//	
}