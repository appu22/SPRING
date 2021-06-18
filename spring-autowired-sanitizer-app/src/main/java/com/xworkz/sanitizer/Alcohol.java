package com.xworkz.sanitizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


//@RequiredArgsConstructor
@ToString
@Component
public class Alcohol {
//	@Value("Rum")
//	@NonNull
	private String name;
//	@Value("500.0")
//	@NonNull
	private double price;
//	@Value("Ruma")
//	@NonNull
	private String brand;
//	@Value("23-03-2020")
//	@NonNull
	private String manufactureDate;
//	@Value("23-03-2021")
//	@NonNull
	private String expireDate;

	public Alcohol() {
		System.out.println("Object Created === > " + getClass().getSimpleName());
	}

	//using properties file initilization instance variable
	@Value("${Alcohol.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Value("${Alcohol.price}")
	public void setPrice(double price) {
		this.price = price;
	}
	@Value("${Alcohol.brand}")
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Value("Alcohol.manufactureDate")
	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	@Value("Alcohol.expireDate")
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

}
