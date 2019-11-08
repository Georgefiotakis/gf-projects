package com.app.springbootrestapi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "product")
@Setter
@Getter
public class Product {
	
	public Long getProductCode() {
		return ProductCode;
	}

	public void setProductCode(Long productCode) {
		ProductCode = productCode;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public Long getPrice() {
		return Price;
	}

	public void setPrice(Long price) {
		Price = price;
	}

	public String getExpirationDate() {
		return ExpirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		ExpirationDate = expirationDate;
	}

	public String getAvailabilityDate() {
		return AvailabilityDate;
	}

	public void setAvailabilityDate(String availabilityDate) {
		AvailabilityDate = availabilityDate;
	}

	@Id
	@Column(name = "Product_Code")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ProductCode;
	
	@Column(name = "Product_Name")
	private String ProductName;
	
	@Column(name = "Price")
	private Long Price;
	
	@Column(name = "Expiration_Date")
	private String ExpirationDate;
	
	@Column(name = "Availability_Date")
	private String AvailabilityDate;
}
