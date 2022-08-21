package com.solid.singleResponsibility;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.solid.singleResp.voilation.User;

//Handles incoming JSON requests that work on User resource/entity
public class UserController {
	// Store used by controller
	

	private UserValidator validatorUser = new UserValidator();
	private UserRepository repo = new UserRepository();

	// Create a new user
	public String createUser(String userJson) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		User user = mapper.readValue(userJson, User.class);

		if (!validatorUser.validateUser(user)) {
			return "ERROR";
		}
		repo.storeUser(user);

		return "SUCCESS";
	}
	
}
