package com.daironh.backendninja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daironh.backendninja.converter.ContactConverter;
import com.daironh.backendninja.entity.Contact;
import com.daironh.backendninja.model.ContactModel;
import com.daironh.backendninja.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Autowired()
	private ContactConverter contactConverter;

	public void addContact(ContactModel contactModel) {

		Contact contact = contactConverter.convertModelToEntity(contactModel);

		contactRepository.save(contact);
	}

	public List<Contact> findAll() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

}
