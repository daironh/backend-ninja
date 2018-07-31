package com.daironh.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.daironh.backendninja.model.UserCredential;

/**
 * The Class LoginController.
 */
@Controller
public class LoginController {

	/**
	 * Redirect to login.
	 *
	 * @return the string
	 */
	@GetMapping("/")
	public String redirectToLogin() {
		return "redirect:/login";
	}

	@GetMapping("/login")
	public String showLoginForm(Model model,
			@RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		model.addAttribute("userCredentials", new UserCredential());
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return "login";
	}

	@PostMapping("/logincheck")
	public String loginCheck(@ModelAttribute(name = "userCredentials") UserCredential userCredential) {
		if (userCredential.getUsername().equals("user") && userCredential.getPassword().equals("user")) {
			return "contacts";
		}
		return "redirect:/login?error";
	}

}
