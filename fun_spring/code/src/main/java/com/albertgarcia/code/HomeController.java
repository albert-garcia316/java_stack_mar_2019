package com.albertgarcia.code;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@PostMapping("/checkcode")
	public String check(
			@RequestParam(value="code") String code, 
			Model model, 
			RedirectAttributes redirectAttributes) {
		if(code.equals("bushido")) {
			return "redirect:/code";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must Train Harder!");
			return "redirect:/";
		}
		
	}
	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}
}
