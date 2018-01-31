package com.boto.onlineshopbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boto.onlineshopbackend.dao.CategoryDao;
import com.boto.onlineshopbackend.dto.Category;

@Repository("categoryDao")
@Transactional
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public List<Category> list() {
		
		return 	(List<Category>) hibernateTemplate.findByNamedQueryAndNamedParam("Category.findallActive", "ACTIVE", true);

	}

	/*
	 * get single record by id 
	 * */
	public Category getbyid(Integer id) {
		
		return hibernateTemplate.get(Category.class, id);

	}

	public Boolean add(Category category) {

		try {
			hibernateTemplate.persist(category);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Boolean update(Category category) {
		hibernateTemplate.update(category);
		return true;
	}

	public Boolean delete(Category category) {
		category.setActive(false);
		// TODO Auto-generated method stub
		return true;
	}

}
