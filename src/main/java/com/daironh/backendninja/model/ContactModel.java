package com.daironh.backendninja.model;

public class ContactModel {

	private String firstname;
	private String lastname;
	private String telephone;
	private String city;

	/**
	 * @param firstaname
	 * @param lastname
	 * @param telephone
	 * @param city
	 */
	public ContactModel(String firstaname, String lastname, String telephone, String city) {
		super();
		this.firstname = firstaname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.city = city;
	}

	/**
	 * 
	 */
	public ContactModel() {
		super();
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstaname) {
		this.firstname = firstaname;
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
		return "ContactModel [firstaname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone
				+ ", city=" + city + "]";
	}

}
