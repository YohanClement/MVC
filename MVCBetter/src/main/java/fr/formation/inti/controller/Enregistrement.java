package fr.formation.inti.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.formation.inti.model.User;

@Controller
public class Enregistrement {
	

	@RequestMapping("/enregistrer")
	public String Sauver(@Valid @ModelAttribute("user") User user, BindingResult br) {
		if (br.hasErrors())
			return "hello";
		else
			return "recap";

	}

}
