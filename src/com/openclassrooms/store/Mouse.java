package com.openclassrooms.store;

public class Mouse extends Item {

	public Mouse(double price, Brand brand) {
		super(price, brand);
	}

	@Override
	public String transformItemInToString() {
		return "Mouse:{" + super.transformItemInToString() + "}";
	}

}
