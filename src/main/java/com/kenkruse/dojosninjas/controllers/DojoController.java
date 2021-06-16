package com.kenkruse.dojosninjas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenkruse.dojosninjas.models.Dojo;
import com.kenkruse.dojosninjas.services.DojoNinjaService;

@Controller
public class DojoController {
	private final DojoNinjaService dojoNinjaService;
	
	public DojoController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojoObject") Dojo dojo) {
		return "/dojosninjas/newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojoObject") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {

			return "/dojosninjas/newdojo.jsp";
		}
		else {
			dojoNinjaService.addDojo(dojo);

			return "redirect:/ninjas/new";
		}
	}
	
	@GetMapping("/dojos/{dojoId}")
	public String showDojoNinjas(@PathVariable("dojoId") long id, Model model) {
		Dojo dojo = dojoNinjaService.singleDojo(id);
		model.addAttribute("dojo", dojo);
		return "/dojosninjas/showdojoninjas.jsp";
	}
}
