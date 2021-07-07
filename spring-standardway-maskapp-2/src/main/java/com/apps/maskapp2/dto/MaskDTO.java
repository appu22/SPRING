package com.apps.maskapp2.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Component
public class MaskDTO implements Serializable {

	private int id;
	private String buyerName;
	private String maskName;
	private double price;
	private int qty;

	public MaskDTO() {
		System.out.println(getClass().getSimpleName() + "Object is created");
	}

}
