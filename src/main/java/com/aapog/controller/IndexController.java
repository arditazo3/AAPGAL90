package com.aapog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aapog.broker.IProductBroker;
import com.aapog.entity.Product;

@Controller
public class IndexController {
 
	private IProductBroker productBroker;
	
	@Autowired
	public void setProductBroker(IProductBroker productBroker) {
		this.productBroker = productBroker;
	}

	@RequestMapping("/")
	public String index() {
		return "redirect:/login";
	}
	
}
