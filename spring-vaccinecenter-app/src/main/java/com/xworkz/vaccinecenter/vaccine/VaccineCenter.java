package com.xworkz.vaccinecenter.vaccine;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class VaccineCenter {

	@NonNull
	private String vaccineCenterName;
	@NonNull
	private String donor;
	@NonNull
	private String type;
	@NonNull
	private Address address;
	
	
	
	public VaccineCenter() {
		
		System.out.println(getClass().getSimpleName() + " Object created..");
	}

}
