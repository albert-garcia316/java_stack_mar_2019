package com.albertgarcia.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.albertgarcia.languages.models.Language;
import com.albertgarcia.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService lS;
	public LanguageController(LanguageService lS) {
		this.lS = lS;
	}
	
	@GetMapping("/languages")
	public String index(Model model, @ModelAttribute("languageObj") Language languageObj) {
		List<Language> languages = lS.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String create(Model model, @Valid @ModelAttribute("languageObj") Language languageObj, BindingResult result) {
        if (result.hasErrors()) {
            List<Language> languages= lS.allLanguages();
            model.addAttribute("languages", languages);
        	return "index.jsp";
        } 
        else {
            lS.createLanguage(languageObj);
            return "redirect:/languages";
        }
	}
	@GetMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Language language = lS.findLanguage(id);
		if(language != null) {
			model.addAttribute("language", language);
			return "show.jsp";
		}
		return "redirect:/languages";
	}
	
	@GetMapping("/languages/{id}/edit")
	public String edit(@PathVariable("id") Long id, Model model) {
		Language language = lS.findLanguage(id);
		if(language != null) {
			model.addAttribute("language", language);
			return "edit.jsp";
		}
		return "redirect:/languages";
	}
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "edit.jsp";
        } else {
            lS.updateLanguage(language);
            return "redirect:/languages";
        }
    }
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Long id) {
		Language language = lS.findLanguage(id);
		if(language != null) {
			lS.deletelanguage(id);
			return "redirect:/languages";
		}
		return "redirect:/languages/{id}";
    }
}
