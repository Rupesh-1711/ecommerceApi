package com.ecommerceApi.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MyErrorDetail {


	private LocalDateTime timestamp;
	private String message;
	private String description;
	
	
	public MyErrorDetail() {
		super();
	}
	public MyErrorDetail(LocalDateTime timestamp, String message, String description) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
