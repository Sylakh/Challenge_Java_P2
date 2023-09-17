package com.openclassrooms.store;

public class Screen extends Item {

	public String resolution;

	public Screen(double price, Brand brand, String resolution) {
		super(price, brand);
		this.resolution = resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getResolution() {
		return resolution;
	}

	@Override
	public String transformItemInToString() {
		return "Screen:{" + super.transformItemInToString() + resolution + "}";
	}
}
