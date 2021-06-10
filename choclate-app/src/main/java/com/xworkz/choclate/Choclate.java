package com.xworkz.choclate;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor

public class Choclate {

	private int id;
	@NonNull
	private String name;
	@NonNull
	private String brand;
	@NonNull
	private double price;

	
	public Choclate() {

		System.out.println(getClass().getName() + " Choclate  created   ");

	}

	public void taste() {
		System.out.println("Choclate Taste method invoking........!");
	}

}
