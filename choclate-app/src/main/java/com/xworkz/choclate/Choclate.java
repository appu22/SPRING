package com.xworkz.choclate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Choclate {

	private int id;
	private String name;
	private String brand;
	private double price;

	public Choclate() {

		System.out.println(getClass().getName() + " Choclate  created   ");

	}

	public void taste() {
		System.out.println("Choclate Taste method invoking........!");
	}

}
