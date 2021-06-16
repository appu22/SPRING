package com.xworkz.vaccinecenter.vaccine;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Address {
	@NonNull
	private String street;

	@NonNull
	private String area;
	@NonNull
	private int pincode;

	public Address() {
		System.out.println(getClass().getSimpleName() + " Obejct Craeted...");
	}

}
