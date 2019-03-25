package com.albertgarcia.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertgarcia.dojoninjas.models.Dojo;
import com.albertgarcia.dojoninjas.models.Ninja;
import com.albertgarcia.dojoninjas.services.DojoService;
import com.albertgarcia.dojoninjas.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService nS;
	private final DojoService dS;

	public NinjaController(NinjaService nS, DojoService dS) {
		this.nS = nS;
		this.dS = dS;
	}
	@GetMapping("/ninjas/new")
	public String newNinja(Model model, @ModelAttribute(value="ninja") Ninja ninja) {
		List<Dojo> dojos = dS.allDojos();
		model.addAttribute("dojos", dojos);
		return "ninja.jsp";
	}
	@PostMapping("/ninjas")
	public String createNinja(Model model, @Valid @ModelAttribute(value="ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		}
		Ninja n = nS.createNinja(ninja);
		Dojo d = n.getDojo();
		return "redirect:/dojos/" + d.getId();
	}
	
	
}
