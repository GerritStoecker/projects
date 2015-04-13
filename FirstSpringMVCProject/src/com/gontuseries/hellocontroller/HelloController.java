package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String, String> pathVars) {

		String country = pathVars.get("countryName");
		String name = pathVars.get("userName");
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Welcome " + name + "! You are from " + country);

		return model;
	}

	@RequestMapping("/hi")
	public ModelAndView hiWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hi world");

		return model;
	}

}