package com.boto.onlineshopbackend.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( name="CATEGORY_TBL")
@NamedQueries({@NamedQuery(name="Category.findallActive",query="From Category where active = :ACTIVE")})
public class Category { 
	
	/*
	 * 
	 * private fields
	 * 
	 * */
	@Id
	@GeneratedValue( generator="category_id_seq",  strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(sequenceName="category_id_seq",name="category_id_seq" ,allocationSize=1)
	private Integer id ;
	private String name;
	private String description;
	@Column(name="img_url")
	private String imgUrl;
	@Column(name="is_active")
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
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", description=" + description + ", imgUrl=" + imgUrl
				+ ", active=" + active + "]";
	}
	
	
	

	
	
}
