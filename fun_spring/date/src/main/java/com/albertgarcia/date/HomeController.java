package com.albertgarcia.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("EEEE dd MMMM yyyy");
		String strDate = dateFormat.format(date);
		String[] strArr = strDate.split(" ");
		strDate = strArr[0] + ", the " + strArr[1] + " of " + strArr[2] + ", " + strArr[3];
		model.addAttribute("date", strDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
		String strDate = dateFormat.format(date);
		
		model.addAttribute("time", strDate);
		return "time.jsp";
	}
}
