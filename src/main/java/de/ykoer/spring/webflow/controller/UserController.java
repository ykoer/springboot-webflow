package de.ykoer.spring.webflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/")
public class UserController {
	@GetMapping
	public String home() {
		return "flows/index";
	}
}
