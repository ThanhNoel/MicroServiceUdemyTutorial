package com.microservice.noel.userservice.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5491452711373842835L;
	
	@Id
	@GeneratedValue
	private long id; // db ID
	@Column(nullable = false, length = 120, unique = true, name = "userId")
	private String userId;  // ID used by client
	@Column(nullable = false, length = 50, name = "first_name")
	private String firstName;
	@Column(nullable = false, length = 50, name = "last_name")
	private String lastName;
	@Column(nullable = false, length = 120, unique = true, name = "email")
	private String email;
	@Column(nullable = false, name = "password")
	private String encryptedPassword;

}
