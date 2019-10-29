package com.airline.repository;

import org.springframework.transaction.annotation.Transactional;

import com.airline.model.User;

public interface RegisterRepositoryInterface {

	void addNewUser(User user);

}