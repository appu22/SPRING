package com.apps.maskapp2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apps.maskapp2.dto.MaskDTO;

@Controller // controller is a child of @Component
//@RequestMapping("/")
public class MaskController {

	@RequestMapping(value = "mask.do", method = RequestMethod.POST)
	public String maskOrder(@ModelAttribute MaskDTO dto, Model model) {
		System.out.println("maskOrder invoked...");
		System.out.println(dto);

		double price = dto.getPrice();
		int qty = dto.getQty();
		double total = price * qty;
		String buyerName = dto.getBuyerName();

		model.addAttribute("name", buyerName);
		model.addAttribute("responceMessage","\n MaskName : " + dto.getMaskName()
				+ " \n Price : " + total + " \n Quantity :  " + dto.getQty());

		// return "/mask.jsp";
		return "Responce";
		// using InternalResourceViwerResolover it will having two Parameters (prefix
		// ,suffix)
	}

	public void loginController() {
		System.out.println("loginController invoked..");

	}

}
