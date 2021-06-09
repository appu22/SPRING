package com.xworkz.choclate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChoclateTester {

	public static void main(String[] args) {
		String xmlPath = "springConfiguartion.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		Choclate choclate = applicationContext.getBean(Choclate.class);

		choclate.setName("kismi");
		choclate.setBrand("parale");
		choclate.setPrice(0.50);
		System.out.println("Choclate Name :  "+choclate.getName() +"\n Choclate Brand Name : "
				+ ""+ choclate.getBrand() +"\n Choclate Price : "+choclate.getPrice()) ;
		
		choclate.taste();

	}

}
