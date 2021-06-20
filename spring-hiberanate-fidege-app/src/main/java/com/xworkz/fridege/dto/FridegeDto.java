package com.xworkz.fridege.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="fridge_table")
public class FridegeDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="F_ID")
	private int id;
	@Column(name="F_NAME")
	@NonNull
	private String name;
	@Column(name="F_PRICE")
	@NonNull
	private double price;

	public FridegeDto() {
		System.out.println("Object created -->"+getClass().getSimpleName());
	}

}
