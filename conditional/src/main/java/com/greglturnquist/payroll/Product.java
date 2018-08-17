package com.greglturnquist.payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
public class Product {

	private @Id @GeneratedValue Long id;
	private String name;
	private double categoryId;
	private String price;
	private String description;

	private @Version @JsonIgnore Long version;

	private Product() {}

	public Product(String name,double categoryId, String price, String description) {
		this.name = name;
		this.categoryId = categoryId;
		this.price = price;
		this.description = description;
	}
}
// end::code[]