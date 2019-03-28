package com.albertgarcia.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{location}")
	public String index(@PathVariable("location") String location) {
		if(location.equals("dojo")){
				return "The " + location + " is awesome!";
		}
		else if(location.contains("burbank")){
			return "The Burbank Dojo is located in Southern California!";
		}
		else if(location.equals("san-jose")) {
			return "The SJ dojo is the headquarters!";
		} else {
			return "Coding Dojo doesn't have a location there yet";
		}
	}
}
