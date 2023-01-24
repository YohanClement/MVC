package fr.formation.inti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.formation.inti.model.User;

@Controller
public class Welcome {
	
	@GetMapping("/hello")
	public String show(Model model) {
		User user= new User();
		model.addAttribute("user", user);
		return "hello";
	}

}
