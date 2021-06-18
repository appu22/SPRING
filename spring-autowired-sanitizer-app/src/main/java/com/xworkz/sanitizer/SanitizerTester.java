package com.xworkz.sanitizer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SanitizerTester {

	public static void main(String[] args) {

		System.out.println("Progreams Start");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		
		Sanitizer sanitizer = applicationContext.getBean(Sanitizer.class);
		System.out.println(sanitizer);
		Alcohol alcohol = applicationContext.getBean(Alcohol.class);
		System.out.println(alcohol);

		
		//downCasting child to parent
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;

		System.out.println("Closed..");
		context.close();
	}

}
