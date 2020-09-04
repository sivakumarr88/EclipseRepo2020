package com.siva.thrillio.services;

import com.siva.thrillio.entities.User;

public class UserService {

	private static UserService instance = new UserService();

	private UserService() {}

	public static UserService getInstance() {
		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
		User user = new User(id, email, password, firstName, lastName, gender, userType);
		return user;
	}

}
