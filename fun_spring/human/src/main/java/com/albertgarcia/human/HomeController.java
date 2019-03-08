package com.albertgarcia.human;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String index(@RequestParam(value="firstname", required=false) String firstname, @RequestParam(value="lastname", required= false) String lastname) {
		if(firstname == null && lastname == null) {
			return "Hello Human";
		} else if(lastname == null) {
			return "Hello " + firstname;
		} else {
			return "Hello " + firstname + " " + lastname;
		}

	}
	
}
