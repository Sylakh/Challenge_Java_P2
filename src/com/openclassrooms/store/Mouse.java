package com.openclassrooms.store;

public class Mouse extends Item {

	public Mouse(Brand brand, double price) {
		super(Brand, price);
	}

	@override
	public String transformItenInToString() {
		return "Mouse:{" + super.transformItemInToString() + "}";
	}

}
