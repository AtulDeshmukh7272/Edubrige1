package com.customer.exception;

@SuppressWarnings("serial")
public class CustomerAlreadyExistException extends RuntimeException {
	
	
	private String message;

	public CustomerAlreadyExistException() {
		
	}

	public CustomerAlreadyExistException(String message) {
		super(message);
		this.message = message;
	}
	
	

}
