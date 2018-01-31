package com.boto.onlineshopbackend.dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonClassDescription;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Prodeuct_tbl")
@NamedQueries({ @NamedQuery(name = "Prodeuct.findall", query = "From Prodeuct"),
		@NamedQuery(name = "Prodeuct.findallActive", query = "From Prodeuct where active = :active ") })
@XmlRootElement
public class Prodeuct {
	/*
	 * 
	 * private field
	 * 
	 */
	@Id
	
	private Integer id;
	private String code;
	private String name;
	private String brand;
	@JsonIgnore
	private String description;
	@Column(name = "uint_price")
	private Double uintPrice;
	private Integer quntity;
	@Column(name = "is_active")
	@JsonIgnore
	private Boolean active;
	@Column(name = "category_id")
	@JsonIgnore
	private Integer categoryId;
	@Column(name = "sipplier_id")
	@JsonIgnore
	private Integer sipplierId;
	private Integer purchase;
	private Integer views;

	/*
	 * 
	 * Defualt Constructor
	 */

	public Prodeuct() {

		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();

	}

	/*
	 * Sette and Getter
	 * 
	 * 
	 * 
	 */

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getUintPrice() {
		return uintPrice;
	}

	public void setUintPrice(Double uintPrice) {
		this.uintPrice = uintPrice;
	}

	public Integer getQuntity() {
		return quntity;
	}

	public void setQuntity(Integer quntity) {
		this.quntity = quntity;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getSipplierId() {
		return sipplierId;
	}

	public void setSipplierId(Integer sipplierId) {
		this.sipplierId = sipplierId;
	}

	public Integer getPurchase() {
		return purchase;
	}

	public void setPurchase(Integer purchase) {
		this.purchase = purchase;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

}
