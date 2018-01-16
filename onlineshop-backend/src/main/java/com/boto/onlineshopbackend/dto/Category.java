package com.boto.onlineshopbackend.dto;

public class Category { 
	
	/*
	 * 
	 * private fields
	 * 
	 * */
	
	private Integer id ;
	private String name;
	private String description;
	private String imgUrl;
	private Boolean active = true ;
	
	
	
	
	
	/*
	 *
	 *setter and getter 
	 */
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	
	

	
	
}
