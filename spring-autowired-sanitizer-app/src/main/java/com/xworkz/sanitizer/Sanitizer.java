package com.xworkz.sanitizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Component
public class Sanitizer {
	@Value("Lifebuoy")
	@NonNull
	private String sanitizerName;
	@Value("100.0")
	@NonNull
	private double sanitizerPrice;
	@Value("")
	@NonNull
	private String alcoholContent;
	@Autowired//access another object /bean
	@NonNull
	private Alcohol alcohol;
	@Value("10-10-2021")
	@NonNull
	private String manufacturesDate;
	@Value("11-05-2021")
	@NonNull
	private String expireDate;
	@Value("true")
	@NonNull
	boolean isAlcoholContent;

	public Sanitizer() {
		System.out.println("Obejct Craeted --> " + getClass().getSimpleName());
	}
}
