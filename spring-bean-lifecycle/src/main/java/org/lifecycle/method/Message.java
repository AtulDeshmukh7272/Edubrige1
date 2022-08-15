package org.lifecycle.method;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Message {
	
	private String message;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Message(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println("This is init method");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("This is destroy method");
	}
	
}
