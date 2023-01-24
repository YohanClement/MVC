package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.formation.inti.model.User;

@Controller
public class Welcome {
	
	@GetMapping("/hello")
	public String show(@RequestParam String nom, Model model) {
		model.addAttribute("nom", nom);
		User user= new User();
		model.addAttribute("user", user);
		return "hello";
	}

}
