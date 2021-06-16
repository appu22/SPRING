package com.xworkz.vaccinecenter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.vaccinecenter.vaccine.VaccineCenter;

public class VaccineCenterTester {
	
	public static void main(String[] args) {
		
		String configLocation = "ApplicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);
		VaccineCenter bean = applicationContext.getBean(VaccineCenter.class);
		System.out.println(bean);
		
	}
	

}
