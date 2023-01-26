package fr.formation.inti.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
//	@Autowired
//	private EmployeeDaoImpl dao;

	@GetMapping(value = { "/", "/welcome" })
	public String welcomePage(Model model) {
		model.addAttribute("title", "Welcome");
		model.addAttribute("message", "This is welcome page!");
		return "welcomePage";
	}

	@GetMapping(value = "/admin")
	public String adminPage(Model model) {
		return "adminPage";
	}

	@GetMapping(value = "/login")
	public String loginPage(Model model) {

		return "loginPage";
	}

	@GetMapping(value = "/logoutSuccessful")
	public String logoutSuccessfulPage(Model model) {
		model.addAttribute("title", "Logout");
		return "logoutSuccessfulPage";
	}

	@GetMapping(value = "/userInfo")
	public String userInfo(Model model, Principal principal) {

		// After user login successfully.
		String userName = principal.getName();
//		List<Employee> emps = dao.findAll();

//		System.out.println("User Email: " + userName);
		model.addAttribute("message", "Hi " + userName + "<br> You succeded! " + principal.toString());
//		model.addAttribute("emp", emps);
		return "userInfoPage";
	}

	@GetMapping(value = "/403")
	public String accessDenied(Model model, Principal principal) {

		if (principal != null) {
			model.addAttribute("message",
					"Hi " + principal.getName() + "<br> You do not have permission to access this page!");
		} else {
			model.addAttribute("msg", "You do not have permission to access this page!");
		}
		return "403Page";
	}
}
