package com.airline.dto;


public class UserDto {

	
	private String firstName;
	private String lastName;
	private String email;
	private String fpassword;
	private String spassword;
	public String dateOfBirth;
	private long phone;
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
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
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
	public String getFpassword() {
		return fpassword;
	}
	public void setFpassword(String fpassword) {
		this.fpassword = fpassword;
	}
	public String getSpassword() {
		return spassword;
	}
	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}
	
	
	



	
}
