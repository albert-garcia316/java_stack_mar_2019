package com.albertgarcia.languages.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertgarcia.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService lS;
	public LanguageController(LanguageService lS) {
		this.lS = lS;
	}
	
	@GetMapping("/languages")
	public String index(Model model) {
		return "index.jsp";
	}
	@PostMapping("/languages")
	public String create() {
		return "redirect:/languages";
	}
}
