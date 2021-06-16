package com.xworkz.supermarket.supermarket;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SuperMarket {

	@NonNull
	private String name;
	@NonNull
	private int noOfCounters;
	@NonNull
	private int gst;
	@NonNull
	private Address address;
	@NonNull
	private Workers workers;

	
	public SuperMarket() {
		System.out.println(getClass().getSimpleName()+" Object Created ");
	}


	@Override
	public String toString() {
		return "SuperMarket [name=" + name + ", noOfCounters=" + noOfCounters + ", gst=" + gst + ", address=" + address
				+ ", workers=" + workers + "]";
	}
	
	
}
