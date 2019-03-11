package com.albertgarcia.jsptest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String homeRoute() {
		return "index.jsp";
	}
}
