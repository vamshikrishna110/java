package com.bike.bean;

import java.io.Serializable;

public class Bike {//implements Serializable {
	private String regdId;
	private String bikeName;
	private String color;
	private float price;
	
	public Bike() {
		
	}

	public Bike(String regdId, String bikeName, String color, float price) {
		super();
		this.regdId = regdId;
		this.bikeName = bikeName;
		this.color = color;
		this.price = price;
	}

	public String getRegdId() {
		return regdId;
	}

	public void setRegdId(String regdId) {
		this.regdId = regdId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Bike [regdId=" + regdId + ", bikeName=" + bikeName + ", color=" + color + ", price=" + price + "]";
	}
	
}
