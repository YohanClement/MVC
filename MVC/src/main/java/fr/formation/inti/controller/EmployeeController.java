package fr.formation.inti.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.inti.model.Employee;

@Controller
public class EmployeeController {

	@GetMapping("/addemployee")
	public String getform(Model model) {
		model.addAttribute("emp", new Employee());
		return "AddEmp";
	}

	@PostMapping("/addemployee")
	public String setemployee(@ModelAttribute("emp") Employee emp, Model model) {
//		if (br.hasErrors())
//			return "index";
//		else
			return "show";
	}

}
