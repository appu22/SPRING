package com.xworkz.supermarket.supermarket;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@ToString
@RequiredArgsConstructor
public class Workers {

	@NonNull
	private int workersID;
	@NonNull
	private String name;
	@NonNull
	private int age;
	@NonNull
	private long mobileNO;

	public Workers() {
		System.out.println(getClass().getSimpleName()+" Object Created..");
	}
	
}
