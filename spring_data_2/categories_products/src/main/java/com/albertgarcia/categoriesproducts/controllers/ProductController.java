package com.albertgarcia.categoriesproducts.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertgarcia.categoriesproducts.models.Category;
import com.albertgarcia.categoriesproducts.models.CategoryProduct;
import com.albertgarcia.categoriesproducts.models.Product;
import com.albertgarcia.categoriesproducts.services.CategoryProductService;

@Controller
public class ProductController {
	private final CategoryProductService catProService;
	
	public ProductController(CategoryProductService catProService) {
		this.catProService = catProService;
	}
	
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute(value="product") Product product) {
		return "product.jsp";
	}
	@PostMapping("/products")
	public String createCategory(Model model, @Valid @ModelAttribute(value="product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "product.jsp";
		}
		Product p = catProService.createProduct(product);
		model.addAttribute("product", p);
		return "redirect:/products/" + p.getId();
	}
	@GetMapping("/products/{id}")
	public String findCategory(@PathVariable(value="id") Long id, Model model, @ModelAttribute(value="catPro") CategoryProduct catPro) {
		Product p = catProService.findProduct(id);

		model.addAttribute("product", p);
		model.addAttribute("allOtherCategoires", catProService.findAllOtherCategories(p));
		return "show_product.jsp";
	}
	@PostMapping("/addCategory")
	public String addCategoryToProduct(@ModelAttribute(value="catPro") CategoryProduct catPro) {
		catProService.addCategoryToProduct(catPro);
		return "redirect:/products/" + catPro.getProduct().getId();
	}
}
