package com.sfdevs.marvel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdevs.marvel.model.User;
import com.sfdevs.marvel.repository.UserRepository;


@RestController
@RequestMapping("/api/v1/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	// get all users
	@GetMapping("users")
	public List<User> getAllUser(){
		return this.userRepository.findAll();
	}
	
}
