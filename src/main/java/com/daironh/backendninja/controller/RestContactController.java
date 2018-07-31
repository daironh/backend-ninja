package com.daironh.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daironh.backendninja.entity.Contact;
import com.daironh.backendninja.service.ContactService;

@RestController
@RequestMapping("/api")
public class RestContactController {
	
	@Autowired
	private ContactService contactService;

	@RequestMapping("/contacts")
	public List<Contact> getAllContacts() {
		List<Contact> contacts = new ArrayList<>();
		contacts = contactService.findAll();
		return contacts;
	}

}
