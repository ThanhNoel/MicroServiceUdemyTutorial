package com.microservice.noel.userservice.controller;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.noel.userservice.data.UserEntity;
import com.microservice.noel.userservice.model.CreateUserRequestModel;
import com.microservice.noel.userservice.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {
	
	private final UserService userService;
	
	@GetMapping("/status/check")
	public String status() {
		return "User service working";
	}
	@PostMapping
	public String createUser(@Valid @RequestBody CreateUserRequestModel userModel) {
		
		return "User created";
	}

}
