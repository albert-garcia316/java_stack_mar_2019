package com.albertgarcia.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	@PostMapping("/submit")
	public String submit(
			@RequestParam(value="name") String name,
			@RequestParam(value="language") String language,
			@RequestParam(value="location") String location,
			@RequestParam(value="comment") String comment,
			Model model
			) {
		model.addAttribute("name", name);
		model.addAttribute("language", language);
		model.addAttribute("location", location);
		System.out.println(comment + "this is the comment");
		if(comment.equals("")) {
			model.addAttribute("comment", "none");
		} else {
			model.addAttribute("comment", comment);
		}
		if(language.equals("java")) {
			return "java.jsp";
		} else {
			return "results.jsp";
		}
	}
}
