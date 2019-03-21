package com.albertgarcia.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertgarcia.relationships.models.Person;
import com.albertgarcia.relationships.services.PersonService;

@Controller
public class PersonCtrl {
	private final PersonService pS;

	public PersonCtrl(PersonService pS) {
		this.pS = pS;
	}
	
	@GetMapping("/persons/new")
	public String newPerson(@ModelAttribute(value="person") Person person) {
		return "newPerson.jsp";
	}
	@PostMapping("/persons")
	public String createPerson(Model model, @Valid @ModelAttribute(value="person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "newPerson.jsp";
		}
		Person p = pS.createPerson(person);
		model.addAttribute("person", p);
		return "redirect:/persons/" + p.getId();
	}
	@GetMapping("/persons/{id}")
	public String findPerson(@PathVariable(value="id") Long id, Model model) {
		Person p = pS.findPerson(id);
		model.addAttribute("person", p);
		return "show.jsp";
	}
	
}
