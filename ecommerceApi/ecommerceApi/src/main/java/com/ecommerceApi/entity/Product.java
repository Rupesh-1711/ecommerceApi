package com.ecommerceApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long productId;

	    private String title;
	    private Double price;
	    private String description;
	    private Boolean availability;

	    @ManyToOne
	    @JoinColumn(name = "category_id")
	    private Category category;

		public Long getProductId() {
			return productId;
		}

		public void setProductId(Long productId) {
			this.productId = productId;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Boolean getAvailability() {
			return availability;
		}

		public void setAvailability(Boolean availability) {
			this.availability = availability;
		}

		public Category getCategory() {
			return category;
		}

		public void setCategory(Category category) {
			this.category = category;
		}

		public Product(Long productId, String title, Double price, String description, Boolean availability,
				Category category) {
			super();
			this.productId = productId;
			this.title = title;
			this.price = price;
			this.description = description;
			this.availability = availability;
			this.category = category;
		}

		public Product() {
			super();
		}
	    
	    
}
