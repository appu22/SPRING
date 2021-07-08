package com.xworkz.plantsapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name = "plants")
public class PlantsEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "P_ID")
	private int id;

	@NonNull
	@Column(name = "P_DONAR_NAME")
	private String donarName;

	@NonNull
	@Column(name = "P_EMAIL")
	private String email;

	@NonNull
	@Column(name = "P_MOBILE_NO")
	private long mobileNo;

	@NonNull
	@Column(name = "P_CITY")
	private String city;

	@NonNull
	@Column(name = "P_STATE")
	private String state;

	@NonNull
	@Column(name = "P_PINCODE")
	private long pincode;

	@NonNull
	@Column(name = "P_MSG")
	private String msg;

	@NonNull
	@Column(name = "NO_OF_PLANTS_DONATE")
	private String noOfplantsDonate;

	public PlantsEntity() {
		System.out.println(getClass().getSimpleName() + " Object created...");
	}

}
