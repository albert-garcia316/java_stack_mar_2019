package com.albertgarcia.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.albertgarcia.relationships.models.License;
import com.albertgarcia.relationships.models.Person;
import com.albertgarcia.relationships.services.LicenseService;
import com.albertgarcia.relationships.services.PersonService;

@Controller
public class LicenseCtrl {
	private final LicenseService lS;
	private final PersonService pS;

	public LicenseCtrl(LicenseService lS, PersonService pS) {
		this.lS = lS;
		this.pS = pS;
	}
	
	@GetMapping("/licenses/new")
	public String newLicense(Model model, @ModelAttribute(value="license") License license) {
		List<Person> persons = pS.allPersons();
		model.addAttribute("people", persons);
		return "license.jsp";
	}
	@PostMapping("/licenses")
	public String createLicense(@Valid @ModelAttribute(value="license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "license.jsp";
		}
		License l = lS.createLicense(license);
		this.setLicenseNum(l);
		lS.updateLicense(l);
		return "redirect:/persons/new";
	}
	public void setLicenseNum(License l) {
		Person p = l.getPerson();
		String pId = Long.toString(p.getId());
		int lgth = pId.length();
		String number = "";
		for(int i = 0; i < (6 - lgth); i++) {
			number += "0";
		}
		number += pId;
		l.setNumber(number);
	}
}
