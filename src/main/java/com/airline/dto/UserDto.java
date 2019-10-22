package com.airline.dto;

import javax.persistence.Column;

public class UserDto {

	
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	public String dateOfBirth;
	private int phone;
	private String securityQuestionUser;
	private String securityAnswerUser;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getSecurityQuestionUser() {
		return securityQuestionUser;
	}
	public void setSecurityQuestionUser(String securityQuestionUser) {
		this.securityQuestionUser = securityQuestionUser;
	}
	public String getSecurityAnswerUser() {
		return securityAnswerUser;
	}
	public void setSecurityAnswerUser(String securityAnswerUser) {
		this.securityAnswerUser = securityAnswerUser;
	}
	
	
	



	
}
