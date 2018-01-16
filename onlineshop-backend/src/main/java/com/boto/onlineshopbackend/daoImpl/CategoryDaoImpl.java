package com.boto.onlineshopbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.boto.onlineshopbackend.dao.CategoryDao;
import com.boto.onlineshopbackend.dto.Category;
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	private static List<Category> catogries = new ArrayList<Category>();
	static{
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("my name");
	    category.setActive(true);
        category.setImgUrl("a.png");
        
        Category category2 = new Category();
        category2.setId(2);
		category2.setName("Moblie");
		category2.setDescription("my name2");
	    category2.setActive(true);
        category2.setImgUrl("a2.png");
        
        Category category3 = new Category();
        category3.setId(3);
		category3.setName("Laptop");
		category3.setDescription("my name2");
	    category3.setActive(true);
        category3.setImgUrl("a2.png");
        
        
        catogries.add(category);
        catogries.add(category2);
        catogries.add(category3);
	}

	public List<Category> list() {
		return catogries;
	
	}

	public Category getbyid(int id) {
		//enhanced for loop 
		for (Category category : catogries) {
		if( category.getId() == id) 
			return category;

		}
		return null;
		
	}

}
