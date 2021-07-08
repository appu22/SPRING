package com.xworkz.plantsapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.plantsapp.dao.PlantsDAO;
import com.xworkz.plantsapp.dto.PlantsDTO;
import com.xworkz.plantsapp.entity.PlantsEntity;

@Service
public class PlantsServiceImple implements PlantsService {

	@Autowired
	private PlantsDAO dao;

	public PlantsServiceImple() {
		System.out.println(getClass().getSimpleName() + "Object cteated/......");
	}

	@Override
	public boolean validataPlantsDTO(PlantsDTO dto) {

		PlantsEntity entity = new PlantsEntity();
		entity.setDonarName(dto.getDonarName());
		entity.setEmail(dto.getEmail());
		entity.setMobileNo(dto.getMobileNo());
		entity.setCity(dto.getCity());
		entity.setState(dto.getState());
		entity.setPincode(dto.getPincode());
		entity.setMsg(dto.getMsg());
		entity.setNoOfplantsDonate(dto.getNoOfplantsDonate());

//		boolean result = false;
		if (dto.getDonarName() == null) {
			System.out.println("Plase Provide Name");
//			result =true;
//			return result;
		} else if (dto.getPincode() == 0 && dto.getPincode() < 6) {
			System.out.println("Plase provide pincode ");
		} else {
			dao.savePlantsDTO(entity);
		}
		return false;

	}

}
