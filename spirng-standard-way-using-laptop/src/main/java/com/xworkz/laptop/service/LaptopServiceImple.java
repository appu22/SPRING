package com.xworkz.laptop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.laptop.customexception.LaptopName;
import com.xworkz.laptop.dao.LaptopDAOImple;
import com.xworkz.laptop.dto.LaptopDto;

@Component
public class LaptopServiceImple implements LaptopService {

	@Autowired
	private LaptopDAOImple daoImple;

	public LaptopServiceImple(LaptopDAOImple daoImple) {
		System.out.println("Object created ...." + this.getClass().getSimpleName());
		this.daoImple = daoImple;
	}

	public void validateLaptopDetails(LaptopDto dto) {
		System.out.println("Invoking validateLaptopDetails method ");

		try {
			if (dto != null) {
				if (dto.getLaptopName().equals(null)) {
//					System.out.println("Please Provide Name");
					throw new LaptopName("Plase Enter Name ");

//			} else if (dto.getModelNo() == 0) {
//				System.out.println("Please Provide ModelNo");
//
//			} else if (dto.getLaptopPrice() == 0) {
//				System.out.println("Please Provide LaptopPrice");
//
//			} else if (dto.getHdd() == null) {
//				System.out.println("Please Provide getHdd");
				} else {
					System.out.println("## --  Save Method --   ##");
					daoImple.saveLaptopDTO(dto);
				}

			} else {
				System.out.println("** provide object **");
			}

		} catch (LaptopName name) {
			name.printStackTrace();
			System.out.println("{{Please enter name }}");
			
		}
	}

}
