package com.dependent.object.entity;

public class Car {
	
	
private String carNo;
private String carModel;
private String carType;
private String carBrand;
public Car() {
	super();
	// TODO Auto-generated constructor stub
}
public Car(String carNo, String carModel, String carType, String carBrand) {
	super();
	this.carNo = carNo;
	this.carModel = carModel;
	this.carType = carType;
	this.carBrand = carBrand;
}
public String getCarNo() {
	return carNo;
}
public void setCarNo(String carNo) {
	this.carNo = carNo;
}
public String getCarModel() {
	return carModel;
}
public void setCarModel(String carModel) {
	this.carModel = carModel;
}
public String getCarType() {
	return carType;
}
public void setCarType(String carType) {
	this.carType = carType;
}
public String getCarBrand() {
	return carBrand;
}
public void setCarBrand(String carBrand) {
	this.carBrand = carBrand;
}
@Override
public String toString() {
	return "Car [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}



}
