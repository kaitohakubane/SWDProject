package com.sneakergo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "productPage";
	}

	@RequestMapping("/billManagement")
	public String bill(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "billManagementPage";
	}
}