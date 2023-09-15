package com.openclassrooms.store;

public abstract class Item {
	double price;
	Brand brand;

	public Item(double price, Brand brand) {
		this.price = price;
		this.brand = brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public Brand getBrand() {
		return brand;
	}

	public String transformItemInToString() {
		return "brand=" + brand + " price=" + price;
	}
}
