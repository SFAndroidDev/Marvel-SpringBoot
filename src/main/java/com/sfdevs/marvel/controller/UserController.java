package com.sfdevs.marvel.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdevs.marvel.model.User;
import com.sfdevs.marvel.repository.UserRepository;


@RestController
@RequestMapping("/api/v1/")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/*
	 * get all users
	 */
	@GetMapping("users")
	public List<User> getAllUser(){
		return this.userRepository.findAll();
	}
	
	/*
	 * find a user by his Id
	 */
	@GetMapping("users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId )
	throws ResourceNotFoundException {
		User user = userRepository.findById(userId).orElseThrow(() ->
				new ResourceNotFoundException("User not found for the id :: " 
						+userId));
		return ResponseEntity.ok().body(user);
	}
	
	/*
	 * save a user in DataBase
	 */
	@PostMapping("users")
	public User createUser(@RequestBody User user) {
		return this.userRepository.save(user);
	}
	
	/*
	 * update a user in DB
	 */
	@PutMapping("users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId, 
			@Valid @RequestBody User userDetails){
		User user = userRepository.findById(userId).orElseThrow(() ->
		new ResourceNotFoundException("User not found for the id :: " 
				+userId));
		
		// update infos
		user.setFirstname(userDetails.getFirstname());
		user.setLastname(userDetails.getLastname());
		user.setEmail(userDetails.getEmail());
		
		// saving the user back to the DB
		return ResponseEntity.ok(this.userRepository.save(user));
	}
	
	/*
	 * delete a user from DB
	 */
	
	
	
}
