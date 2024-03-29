package com.xworkz.plantsapp.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlantsDTO {
	
	private String donarName;
	private String email;
	private long mobileNo;
	private String city;
	private String state;
	private long pincode;
	private String msg;
	private String noOfplantsDonate;
	
	public PlantsDTO() {
		
		System.out.println(getClass().getSimpleName()+" Object Created....");
	}
}
