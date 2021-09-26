package com.microservice.noel.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.noel.userservice.data.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

}
