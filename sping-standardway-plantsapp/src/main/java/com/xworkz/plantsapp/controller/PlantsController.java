package com.xworkz.plantsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.plantsapp.dto.PlantsDTO;
import com.xworkz.plantsapp.service.PlantsService;

@Controller
public class PlantsController {

	@Autowired
	private PlantsService service;

	public PlantsController() {
		System.out.println("PlantsController Object Created....");
	}
	 
	@RequestMapping(value = "/plants.do", method = RequestMethod.POST) // handlerMapping
	public String plantsDonate(@ModelAttribute PlantsDTO dto, Model model) {
		// @ModelAttribute it will mapping the jsp to dto object
		System.out.println(dto);
		boolean validataPlantsDTO = service.validataPlantsDTO(dto);
		if (validataPlantsDTO) {
			model.addAttribute("responcePage", "Thank you for Donating...." + dto);
		} else {
			System.out.println("Please Provide Valid Data..");
		}
		return "PlantsResponcePage";

	}

}
