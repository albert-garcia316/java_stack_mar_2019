package com.albertgarcia.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			int count = (int) session.getAttribute("count");
			count ++;
			session.setAttribute("count", count);
		}
		return "counter.jsp";
	}
	@RequestMapping("/addtwo")
	public String addTwo(HttpSession session) {

		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
		} else {
			int count = (int) session.getAttribute("count");
			count ++;
			session.setAttribute("count", count);
		}
		return "redirect:/counter";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "redirect:/";
	}
}
