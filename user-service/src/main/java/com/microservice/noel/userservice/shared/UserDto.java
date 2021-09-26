package com.microservice.noel.userservice.shared;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable {
	private static final long serialVersionUID = 4483992665506496444L;
	private String userId;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String encryptedPassword;
}
