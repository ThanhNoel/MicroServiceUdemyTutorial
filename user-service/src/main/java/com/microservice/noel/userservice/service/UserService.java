package com.microservice.noel.userservice.service;

import com.microservice.noel.userservice.shared.UserDto;

public interface UserService {
	
	UserDto createUser(UserDto userDetails);

}
