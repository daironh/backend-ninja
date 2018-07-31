package com.daironh.backendninja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daironh.backendninja.model.ContactModel;
import com.daironh.backendninja.service.ContactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@GetMapping("/cancel")
	public String cancel() {
		return "contacts";
	}

	@GetMapping("/contactForm")
	public String redirectContactForm(Model model) {
		model.addAttribute("contactModel", new ContactModel());
		return "contactform";
	}

	@PostMapping("/addcontact")
	public String addContact(@ModelAttribute(name = "contactModel") ContactModel contactModel) {
		
		contactService.addContact(contactModel);

		return "contacts";

	}

}
