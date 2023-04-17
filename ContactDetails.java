package com.monocept.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContactDetails {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="contact_details_id")
	private int contactDetailsId;
	private String content;
	@Column(name="contact_detail_type")
	private String contactDetailType;
	public ContactDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContactDetails(int contactDetailsId, String content, String contactDetailType) {
		super();
		this.contactDetailsId = contactDetailsId;
		this.content = content;
		this.contactDetailType = contactDetailType;
	}
	public int getContactDetailsId() {
		return contactDetailsId;
	}
	public void setContactDetailsId(int contactDetailsId) {
		this.contactDetailsId = contactDetailsId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContactDetailType() {
		return contactDetailType;
	}
	public void setContactDetailType(String contactDetailType) {
		this.contactDetailType = contactDetailType;
	}
	
}
