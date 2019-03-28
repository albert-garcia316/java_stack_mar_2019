package com.albertgarcia.categoriesproducts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.albertgarcia.categoriesproducts.models.Product;

@Controller
public class ProductController {
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute(value="product") Product product) {
		return "product.jsp";
	}
}
