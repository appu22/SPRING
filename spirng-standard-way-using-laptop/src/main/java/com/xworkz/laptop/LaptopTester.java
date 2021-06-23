package com.xworkz.laptop;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.laptop.dao.LaptopDAO;
import com.xworkz.laptop.dto.LaptopDto;
import com.xworkz.laptop.service.LaptopService;
import com.xworkz.laptop.service.LaptopServiceImple;

public class LaptopTester {

	public static void main(String[] args) {
System.out.println("PROGRAM START");
//		String ConfigLocation = "applicationContext.xml";
		ApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("applicationContext.xml");

		LaptopDto dto = new LaptopDto(null, 25000.0, 123455, "1TB");
		LaptopService service = applicationContext.getBean(LaptopServiceImple.class);
		service.validateLaptopDetails(dto);
		System.out.println(dto);
		System.out.println("--------PROGRAM eNdED---");
	}

}
