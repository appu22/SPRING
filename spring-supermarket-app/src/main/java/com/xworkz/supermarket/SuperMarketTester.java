package com.xworkz.supermarket;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.supermarket.supermarket.SuperMarket;

public class SuperMarketTester {

	public static void main(String[] args) {

		AbstractXmlApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		SuperMarket bean = pathXmlApplicationContext.getBean(SuperMarket.class);
		System.out.println(bean);

	}

}
