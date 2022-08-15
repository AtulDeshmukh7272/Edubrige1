package org.jpa.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.crud.model.Product;
import spring.mvc.crud.service.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	ProductRepository repo;
	
	@RequestMapping(path="/products")
	public String diaplayAllProducts(Model model )
	{
		List<Product> productlist=repo.findAll();
		model.addAttribute("productlist", productlist);
		return "product-list";
	}
	
	
	@RequestMapping(path="/addproduct")
	public String diaplayAddProduct(Model model )
	{
		Product product=new Product();
		model.addAttribute("product", product);
		return "add-product";
	}
	
	@RequestMapping(path="/saveproduct")
	public String saveProduct(@ModelAttribute("product") Product product )
	{
		repo.save(product);
		return "redirect:/products";
	}
	

}
