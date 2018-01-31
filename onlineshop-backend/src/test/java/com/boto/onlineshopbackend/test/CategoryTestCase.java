package com.boto.onlineshopbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.boto.onlineshopbackend.dao.CategoryDao;
import com.boto.onlineshopbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;

	private static CategoryDao categoryDao;
	private Category category;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.boto.onlineshopbackend");
		context.refresh();
		categoryDao = (CategoryDao) context.getBean("categoryDao");
	}

	 @Test
	 public void AddCategory(){
	 Category category = new Category();
	
	 category.setName("Televison");
	 category.setDescription("this the Television description ");
	 category.setImgUrl("t.png");
	 category.setActive(true);
	 assertEquals("Seccefully Added Category", true,
	 categoryDao.add(category));
	
	 }
	
	
//	@Test
//	public void getCategoty() {
//
//		Category getbyid = categoryDao.getbyid(1);
//		assertEquals("Seccefully Fetch Category","Television", getbyid.getName());
//
//	}
	
//	@Test
//	
//	public void updateCategoryTest(){
//		
//			Category category = categoryDao.getbyid(1);
//			category.setName("TV");
//			assertEquals("Seccefully Fetch Category",true, categoryDao.update(category));
//
//	}
	
//@Test
//	
//	public void deleteCategoryTest(){
//		
//			Category category = categoryDao.getbyid(1);
//			assertEquals("Seccefully delete  Category",true, categoryDao.delete(category));
//
//	}
	
	@Test
	public void deleteCategoryTest(){
	
		Category category = categoryDao.getbyid(1);
		assertEquals("Seccefully Fetch all  Categories",3, categoryDao.list().size());

}

	
	
	

}
