package com.kenkruse.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.kenkruse.dojosninjas.models.Dojo;
import com.kenkruse.dojosninjas.models.Ninja;
import com.kenkruse.dojosninjas.services.DojoNinjaService;

@Controller
public class NinjaController {
	private final DojoNinjaService dojoNinjaService;
	
	public NinjaController(DojoNinjaService dojoNinjaService) {
		this.dojoNinjaService = dojoNinjaService;
	}

	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninjaObject") Ninja ninja, Model model) {
		List<Dojo> alldojos = dojoNinjaService.getAllDojos();
		model.addAttribute("dojos", alldojos);

		return "/dojosninjas/newninja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String addNinja(@Valid @ModelAttribute("ninjaObject") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> alldojos = dojoNinjaService.getAllDojos();
			model.addAttribute("dojos", alldojos);
			return "/dojosninjas/newninja.jsp";
		}
		else {
			dojoNinjaService.addNinja(ninja);
			return "redirect:/dojos/" + ninja.getDojo().getId() ;
		}
	}
}