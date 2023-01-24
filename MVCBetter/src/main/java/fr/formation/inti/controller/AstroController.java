package fr.formation.inti.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.inti.model.Astro;

@Controller
public class AstroController {

	@Autowired
	@Qualifier("stringValidator") // nom du validator
	private Validator validator;

	public Validator getValidator() {
		return validator;
	}

	public void setValidator(Validator validator) {
		this.validator = validator;
	}

	public AstroController() {
		// TODO Auto-generated constructor stub
	}

	@ModelAttribute("astro")
	public Astro createEmpleeModel() {
		return new Astro();
	}

	@InitBinder
	private void initBinder(WebDataBinder binder) {
		binder.setValidator(validator);
	}

	@GetMapping(value = "/astro")
	public ModelAndView showForm(Locale locale) {
		return new ModelAndView("zodiac", "astro", new Astro()); // 1 = .jsp et 2 = objet instancié
	}

	@PostMapping(value = "/astro")
	public String submit(@ModelAttribute("astro") @Validated Astro employee, BindingResult br, ModelMap model) { 
		// model attribute must be equal to the one in get method
		if (br.hasErrors()) {
			return "zodiac";
		}
		model.addAttribute("sun", employee.getSun());
		model.addAttribute("moon", employee.getMoon());
		model.addAttribute("rising", employee.getRising());
		model.addAttribute("isB", employee.isB());

		return "youpi";
	}

}
