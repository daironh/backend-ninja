package com.daironh.backendninja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daironh.backendninja.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	public abstract List<Contact> findAll();
	public abstract Contact findContactById(int id);
	

}
