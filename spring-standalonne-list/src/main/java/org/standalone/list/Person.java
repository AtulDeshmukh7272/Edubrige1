package org.standalone.list;

import java.util.List;

public class Person {
	
	private String name;
	private String address;
	private List<String> friends;
	
	public Person() {
	
	}
	public Person(String name, String address, List<String> friends) {
		
		this.name = name;
		this.address = address;
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", friends=" + friends + "]";
	}
	
	

}
