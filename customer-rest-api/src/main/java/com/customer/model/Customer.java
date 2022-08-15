package com.customer.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
	
	private long id;
	private String name;
	private String address;
	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getAddress() {
		// TODO Auto-generated method stub
		return null;
	}
	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}
	public void setAddress(Object address2) {
		// TODO Auto-generated method stub
		
	}

}
