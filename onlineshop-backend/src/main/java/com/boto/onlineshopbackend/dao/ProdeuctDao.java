package com.boto.onlineshopbackend.dao;

import java.util.List;

import com.boto.onlineshopbackend.dto.Prodeuct;

public interface ProdeuctDao {
	Prodeuct getProdeuctById(Integer id);
	List<Prodeuct> FindAllProdeuct();
	Boolean add(Prodeuct Prodeuct);
	Boolean update(Prodeuct Prodeuct);
	Boolean delete(Prodeuct Prodeuct);
	
	
	/*
	 * Bussinse Method
	 * 
	 * */
	List<Prodeuct> ListActiveProdeuct();
	List<Prodeuct> ListActiveProdeuctByCategory(Integer categoryId);
	List<Prodeuct> getLatsetActiveProdeucts(Integer count);
	

}
