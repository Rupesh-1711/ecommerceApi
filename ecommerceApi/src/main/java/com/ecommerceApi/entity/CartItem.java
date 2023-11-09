package com.ecommerceApi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItem {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long cartItemId;

	    @ManyToOne
	    @JoinColumn(name = "product_id")
	    private Product product;

	    private int quantity;

		public CartItem(Long cartItemId, Product product, int quantity) {
			super();
			this.cartItemId = cartItemId;
			this.product = product;
			this.quantity = quantity;
		}

		public CartItem() {
			super();
		}

		public Long getCartItemId() {
			return cartItemId;
		}

		public void setCartItemId(Long cartItemId) {
			this.cartItemId = cartItemId;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
}
