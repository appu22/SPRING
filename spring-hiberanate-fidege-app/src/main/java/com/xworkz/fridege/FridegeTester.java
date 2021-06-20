package com.xworkz.fridege;

import java.nio.file.spi.FileSystemProvider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fridege.dao.FridegeDao;
import com.xworkz.fridege.dao.FridegeDaoImple;
import com.xworkz.fridege.dto.FridegeDto;

public class FridegeTester {

	// pom.xml
	// spring-context
	// spring -orm
	// 1.8 version
	public static void main(String[] args) {
		System.out.println("Program Started...******8");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		FridegeDaoImple bean = applicationContext.getBean(FridegeDaoImple.class);
		
		FridegeDto fridegeDto = new FridegeDto("SAMA", 2500.0);
		bean.saveFridege(fridegeDto);
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) applicationContext;
		System.out.println("program ended...");
		classPathXmlApplicationContext.close();

	}

}
