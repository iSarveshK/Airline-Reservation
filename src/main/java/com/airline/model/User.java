package com.airline.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="TBL_USER")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="s2" )
	@SequenceGenerator(name="s2",sequenceName="user_seq",allocationSize=1)
	@Column(name = "USER_ID")
	private int id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL_ID")
	private String email;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="DATE_OF_BIRTH")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
	
	@Column(name="PHONE_NO")
	private long phone;
	
	@Column(name="SECURITY_QUESTION_USER")
	private String securityQuestionUser;
	
	@Column(name="SECURITY_ANSWER_USER")
	private String securityAnswerUser;
	

	

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", phone=" + phone
				+ ", securityQuestionUser=" + securityQuestionUser + ", securityAnswerUser=" + securityAnswerUser + "]";
	}
	
	
	
	
	
	
}


