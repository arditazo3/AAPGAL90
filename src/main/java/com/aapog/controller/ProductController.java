package com.aapog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.aapog.broker.IProductBroker;
import com.aapog.entity.Product;
import com.aapog.events.style.SelectedSideBarMenu;

@Controller
public class ProductController {

	private IProductBroker productBorker;

	@Autowired
	public void setProductBorker(IProductBroker productBorker) {
		this.productBorker = productBorker;
	}
	
	@RequestMapping(value = "/productslist", method = RequestMethod.GET)
	public String productslist(Model model) {
		
		SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "ViewProducts", null, null, null);
		model.addAttribute("productPanel", eventSelected);
		
		model.addAttribute("products", productBorker.findAll() );
		return "productslist";
	}
	
	@RequestMapping("product/newProduct")
	public String newProduct(Model model) {
		
		SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "CreateProduct", null, null, null);
		model.addAttribute("productPanel", eventSelected);
		
		model.addAttribute("product", new Product());
		return "newProduct";
	}
	
	@RequestMapping(value = "product", method = RequestMethod.POST)
	@Transactional
	public String saveProduct(Product product, Model model) {
		
		SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "ViewProducts", null, null, null);
		model.addAttribute("productPanel", eventSelected);
		
		Product productSaved = productBorker.saveProduct(product);
		return "redirect:/productslist";
	}
	
	@RequestMapping("product/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		
		SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "EditDeleteProduct", null, null, null);
		model.addAttribute("productPanel", eventSelected);
		
		model.addAttribute("product", productBorker.getProductById(new Long(id)) );
		return "newProduct";
	}
	
	@RequestMapping("product/delete/{id}")
	@Transactional
	public String delete(@PathVariable Long id, Model model) {
		
		SelectedSideBarMenu eventSelected = new SelectedSideBarMenu("Products", "EditDeleteProduct", null, null, null);
		model.addAttribute("productPanel", eventSelected);
		
		productBorker.deleteProductById(id);
		return "redirect:/productslist";
	}
	
	@RequestMapping("product/{id}")
	public String showProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", productBorker.getProductById(id) );
		return "productshow"; 
	}
	
}
