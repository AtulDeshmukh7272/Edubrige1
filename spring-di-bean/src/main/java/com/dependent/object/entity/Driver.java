package com.dependent.object.entity;

public class Driver {
	private String driverId;
	private String driverName;
	private String driverContact;
	private Car  car;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(String driverId, String driverName, String driverContact, Car car) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverContact = driverContact;
		this.car = car;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getDriverContact() {
		return driverContact;
	}
	public void setDriverContact(String driverContact) {
		this.driverContact = driverContact;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Driver [driverId=" + driverId + ", driverName=" + driverName + ", driverContact=" + driverContact
				+ ", car=" + car + "]";
	}
	
	
	



}
