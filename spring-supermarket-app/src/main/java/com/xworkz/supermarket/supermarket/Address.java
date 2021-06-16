package com.xworkz.supermarket.supermarket;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Address {
	private String street;
	private String building;
	private int doorNo;
	private String area;
	private int pincode;

	public Address() {
		System.out.println(getClass().getSimpleName() + " Obejct craeted ");
	}

}
