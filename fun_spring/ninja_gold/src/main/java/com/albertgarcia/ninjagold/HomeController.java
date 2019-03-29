package com.albertgarcia.ninjagold;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
	private List<String> log = new ArrayList<>();
	@GetMapping("/")
	public String home(HttpSession session) {
		session.setAttribute("log", this.log);
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
		}
		return "index.jsp";
	}
	@PostMapping("/farm")
	public String farm(HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		gold += this.random("farm");
		session.setAttribute("gold", gold);
		return "redirect:/";
	}
	@PostMapping("/cave")
	public String cave(HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		gold += this.random("cave");
		session.setAttribute("gold", gold);
		return "redirect:/";
	}
	@PostMapping("/house")
	public String house(HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		gold += this.random("house");
		session.setAttribute("gold", gold);
		return "redirect:/";
	}
	@PostMapping("/casino")
	public String casion(HttpSession session) {
		int gold = (int) session.getAttribute("gold");
		gold += this.random("casino");
		session.setAttribute("gold", gold);
		return "redirect:/";
	}
	public int random(String place) {
		int r = 0;
		Date date = new Date();
		Random rand = new Random();
		if(place.equals("farm")) {
			r += (rand.nextInt(21 - 10) + 10);
			this.log.add(0, "You Entered a " + place + " and earned " + r + " gold! (" + date + ")");
		}
		else if(place.equals("cave")) {
			r += (rand.nextInt(11 - 5) + 5);
			this.log.add(0, "You Entered a " + place + " and earned " + r + " gold! (" + date + ")");
		}
		else if(place.equals("house")) {
			r += (rand.nextInt(5 - 2) + 2);
			this.log.add(0, "You Entered a " + place + " and earned " + r + " gold! (" + date + ")");
		}
		else if(place.equals("casino")) {
			int gamble = rand.nextInt(2);
			if(gamble == 1) {
				r += rand.nextInt(51);
				this.log.add(0, "You Entered a " + place + " and earned " + r + " gold! (" + date + ")");
			} else {
				r -= rand.nextInt(51);
				this.log.add(0, "You Entered a " + place + " and lost " + r + " gold... Ouch! " + date);
			}
		}
		return r;
	}
	@GetMapping("/reset")
	public String reset(HttpSession session) {
		this.log.clear();
		session.setAttribute("gold", 0);
		return "redirect:/";

	}
}
