package com.boto.onlineshopbackend.dao;

import java.util.List;

import com.boto.onlineshopbackend.dto.Category;

public interface CategoryDao {
	
	List<Category> list ();
	Category getbyid(int id);
 
}
