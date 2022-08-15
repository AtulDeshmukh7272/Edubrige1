package org.wiring.auto.model;

//Non-dependent bean class
public class B {
	
	private int id;
	private String message;
	
	public B() {
		super();
		// TODO Auto-generated constructor stub
	}
	public B(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "B [id=" + id + ", message=" + message + "]";
	}
	
	

}
