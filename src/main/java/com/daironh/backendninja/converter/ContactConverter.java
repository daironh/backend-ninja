package com.daironh.backendninja.converter;

import org.springframework.stereotype.Component;

import com.daironh.backendninja.entity.Contact;
import com.daironh.backendninja.model.ContactModel;

@Component
public class ContactConverter {

	public Contact convertModelToEntity(ContactModel contactModel) {
		Contact contact = null;

		if (contactModel != null) {
			contact = new Contact();
			contact.setFirstname(contactModel.getFirstname());
			contact.setLastname(contact.getLastname());
			contact.setTelephone(contactModel.getTelephone());
			contact.setCity(contactModel.getCity());
		}

		return contact;
	}

}
