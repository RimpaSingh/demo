package com.tka;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {
	@Id
	private int mobId;
	private String brandname;
	private double price;
	@Override
	public String toString() {
		return "Mobile [mobId=" + mobId + ", brandname=" + brandname + ", price=" + price + "]";
	}
	public Mobile(int mobId, String brandname, double price) {
		super();
		this.mobId = mobId;
		this.brandname = brandname;
		this.price = price;
	}
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getBrandname() {
		return brandname;
	}
	public void setBrandname(String brandname) {
		this.brandname = brandname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
