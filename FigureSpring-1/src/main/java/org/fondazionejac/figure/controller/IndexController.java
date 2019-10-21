package org.fondazionejac.figure.controller;

import org.fondazionejac.figure.service.FiguraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@ComponentScan("org.fondazionejac.figure")
public class IndexController {
	
	@Autowired
	private FiguraService figuraService;

	@GetMapping
	public String getWelcome(Model model) {
		this.setModel(model);
		return "index";
	}

	@GetMapping(value="index")
	public String getWelcomeIndex(Model model) {
		return getWelcome(model);
	}

	private Model setModel(Model model) {
		model.addAttribute("intestazione","Benvenuti in Figure");
		model.addAttribute("saluti","Selezione le figure");
		model.addAttribute("figure", figuraService.SelTutti());
		return model;
	}
}
