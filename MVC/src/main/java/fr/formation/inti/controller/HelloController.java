package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("message", "Bonjour Yohan");
		return "hello";
	}

	@PostMapping("/hello")
	public String submitHello(Model model, @RequestParam("nom") String noms) {
//		String nom = (String) model.getAttribute("nom");
		model.addAttribute("message", "Bonjour "+noms);
		return "hello";
	}

}
