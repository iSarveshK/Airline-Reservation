package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ADMIN")
public class Admin {
	
	@Id
	private int admin_id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="Security_Question")
	private String Security_question;
	
	@Column(name="SECURITY_ANSWER")
	private String answer;
	
	@Column(name="CONTACT")
	private int contact;
	
	@Column(name="EMAIL")
	private String email;
	
	
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSecurity_question() {
		return Security_question;
	}
	public void setSecurity_question(String security_question) {
		Security_question = security_question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
