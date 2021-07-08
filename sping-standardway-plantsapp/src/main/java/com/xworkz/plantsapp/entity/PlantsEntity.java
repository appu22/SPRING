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
@Component
public class PlantsEntity implements java.io.Serializable {

	@Column(name = "P_ID")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "P_DONAR_NAME")
	@NonNull
	private String donarName;
	@Column(name = "P_EMAIL")
	@NonNull
	private String email;
	@Column(name = "P_MOBILE_NO")
	@NonNull
	private long mobileNo;
	@Column(name = "P_CITY")
	@NonNull
	private String city;
	@Column(name = "P_STATE")
	@NonNull
	private String state;
	@Column(name = "P_PINCODE")
	@NonNull
	private long pincode;
	@Column(name = "P_MSG")
	@NonNull
	private String msg;

	@Column(name = "NO_OF_PLANTS_DONATE")
	@NonNull
	private String noOfplantsDonate;

	public PlantsEntity() {
		System.out.println(getClass().getSimpleName() + " Object created...");
	}

}
