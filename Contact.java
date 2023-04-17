package com.monocept.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "contact_id")
	private int contactId;
	@Column(name = "f_name")
	private String fullName;
	@Column(name="l_name")
	private String lastName;
	@Column(name="is_active")
	private boolean isActive;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int contactId, String fullName, String lastName, boolean isActive) {
		super();
		this.contactId = contactId;
		this.fullName = fullName;
		this.lastName = lastName;
		this.isActive = isActive;
	}
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
}
