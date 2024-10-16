package com.project.Model;

import javax.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private Category category;

    public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	public Product(Long id, String name, Double price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setName(Object object) {
		this.name = (String) object;
	}

	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id") 
  

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and setters
}