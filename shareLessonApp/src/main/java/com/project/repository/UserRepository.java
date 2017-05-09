package com.project.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	List<User> findByLastName(String lastName);
	
}