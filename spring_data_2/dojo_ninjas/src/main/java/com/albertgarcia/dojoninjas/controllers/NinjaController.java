package com.albertgarcia.dojoninjas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.albertgarcia.dojoninjas.models.Ninja;
import com.albertgarcia.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService nS;

	public NinjaController(NinjaService nS) {
		this.nS = nS;
	}
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute(value="ninja") Ninja ninja) {
		return "ninja.jsp";
	}
	
	
}
