package com.albertgarcia.dojoninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.albertgarcia.dojoninjas.models.Dojo;
import com.albertgarcia.dojoninjas.services.DojoService;

@Controller
public class DojoController {
	private final DojoService dS;

	public DojoController(DojoService dS) {
		this.dS = dS;
	}
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute(value="dojo") Dojo dojo) {
		return "dojo.jsp";
	}
	@GetMapping("dojos/{id}")
	public String showDojo(@PathVariable(value="id") Long id, Model model) {
		Dojo d = dS.findDojo(id);
		model.addAttribute("dojo", d);
		return "show.jsp";
	}
	
}
