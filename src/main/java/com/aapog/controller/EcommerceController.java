package com.aapog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.aapog.events.style.SelectedSideBarMenu;

@Controller
public class EcommerceController {

	@RequestMapping("/ecommerce")
	public String ecommerceIndex(Model model) {
		
		SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("eCommerce", "Dashboard", null, null, null);
		model.addAttribute("ecommerce_Dashboard", eventSelected);
		return "ecommerce_index";
	}
	
}
