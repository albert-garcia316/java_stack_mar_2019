package com.albertgarcia.dojoninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertgarcia.dojoninjas.models.Dojo;
import com.albertgarcia.dojoninjas.models.Ninja;
import com.albertgarcia.dojoninjas.services.DojoService;
import com.albertgarcia.dojoninjas.services.NinjaService;

@Controller
public class DojoController {
	private final DojoService dS;
	private final NinjaService nS;

	public DojoController(DojoService dS, NinjaService nS) {
		this.dS = dS;
		this.nS = nS;
	}
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute(value="dojo") Dojo dojo) {
		return "dojo.jsp";
	}
	@PostMapping("/dojos")
	public String createDojo(Model model, @Valid @ModelAttribute(value="dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojos/new";
		}
		Dojo d = dS.createDojo(dojo);
		
		return "redirect:/dojos/" + d.getId();
	}
	@GetMapping("dojos/{id}")
	public String showDojo(@PathVariable(value="id") Long id, Model model) {
		Dojo d = dS.findDojo(id);
		List<Ninja> ninjas = nS.findNinjas(d);
		model.addAttribute("dojo", d);
		model.addAttribute("ninjas", ninjas);
		return "show.jsp";
	}
	
}
