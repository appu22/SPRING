package com.xworkz.laptop.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity
@Table(name = "laptop_table")
@Component
public class LaptopDto implements Serializable {

	@Id
	@Column(name = "L_ID")
	private int id;

	@NonNull
	@Column(name = "L_NAME")
	private String laptopName;
	@NonNull
	@Column(name = "L_PRICE")
	private double laptopPrice;
	@NonNull
	@Column(name = "L_MODEL_NO")
	private long modelNo;
	@NonNull
	@Column(name = "L_HDD")
	private String hdd;

	public LaptopDto() {
		System.out.println("Object is created ... " + getClass().getSimpleName());
	}
}
