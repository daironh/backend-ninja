package com.daironh.backendninja.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "firtname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "city")
	private String city;

	public Contact() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Contact [firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone + ", city="
				+ city + "]";
	}

}
