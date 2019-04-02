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
public class CategoryController {
	private final CategoryProductService catProService;
	
	
	public CategoryController(CategoryProductService catProService) {
		this.catProService = catProService;
	}
	
	
	@GetMapping("/categories/new")
	public String newProduct(@ModelAttribute(value="category") Category category) {
		return "category.jsp";
	}
	@PostMapping("/categories")
	public String createCategory(Model model, @Valid @ModelAttribute(value="category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "category.jsp";
		}
		Category c = catProService.createCategory(category);
		model.addAttribute("category", c);
		return "redirect:/categories/" + c.getId();
	}
	@GetMapping("/categories/{id}")
	public String findCategory(@PathVariable(value="id") Long id, Model model, @ModelAttribute(value="catPro") CategoryProduct catPro) {
		Category c = catProService.findCategory(id);
		model.addAttribute("category", c);
		model.addAttribute("allOtherProducts", catProService.findAllOtherProducts(c));
		return "show_category.jsp";
	}
	@PostMapping("/addProduct")
	public String addProductToCategory(Model model, @ModelAttribute(value="catPro") CategoryProduct catPro) {

		catProService.addProductToCategory(catPro);
		return "redirect:/categories/" + catPro.getCategory().getId();
	}
}
