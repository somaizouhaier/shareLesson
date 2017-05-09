package com.project.controller;

import java.lang.annotation.Annotation;
import java.util.List;
	






import javax.annotation.Resource;
import javax.annotation.Resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.User;
import com.project.repository.UserRepository;

@RestController
public class HomeController {

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/hello")
	public String helloAction(){
		return "Hello Zouhaier";
	}
	
	@RequestMapping("/users")
	public ResponseEntity<List<User>> findAllUsersAction(){
		 List<User>  users = (List<User>)userRepository.findAll();
		 return  new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
}
