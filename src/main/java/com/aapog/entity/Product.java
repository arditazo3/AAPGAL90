package com.aapog.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cr_product")
public class Product implements Serializable {

	private Long id;
	private String codProduct;
	private String nameProduct;
	private String descProduct;
	private BigDecimal price;
	private Date date;
	
	public Product() {
	}
	
	public Product(String codProduct, String nameProduct, String descProduct, BigDecimal price, Date date) {
		super();
		this.codProduct = codProduct;
		this.nameProduct = nameProduct;
		this.descProduct = descProduct;
		this.price = price;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "CODE_PRODUCT")
	public String getCodProduct() {
		return codProduct;
	}
	public void setCodProduct(String codProduct) {
		this.codProduct = codProduct;
	}
	
	@Column(name = "NAME_PRODUCT")
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	
	@Column(name = "DESC_PRODUCT")
	public String getDescProduct() {
		return descProduct;
	}
	public void setDescProduct(String descProduct) {
		this.descProduct = descProduct;
	}
	
	@Column(name = "PRICE")
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Column(name = "DATE")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", codProduct=" + codProduct + ", nameProduct=" + nameProduct + ", descProduct="
				+ descProduct + ", price=" + price + ", date=" + date + "]";
	}

}
