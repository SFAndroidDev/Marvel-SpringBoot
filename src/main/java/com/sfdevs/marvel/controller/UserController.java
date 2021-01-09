package com.sfdevs.marvel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdevs.marvel.model.User;
import com.sfdevs.marvel.repository.UserRepository;
import com.sfdevs.marvel.service.UserService;


@RestController
@RequestMapping("/my-api/v1/")
public class UserController {

	@Autowired
	private UserService userService;
	
	//*****
	@Autowired
	private UserRepository userRepository;
	//*****
	
	/*
	 * get all users
	 */
	@GetMapping("users")
	public List<User> getAllUser(){
		return this.userService.findAll();
	}
	
	
	/*
	 * find a user by his Id
	 */
	@GetMapping("users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId )
	throws ResourceNotFoundException {
		
		User user = userService.findById(userId);
		return ResponseEntity.ok().body(user);
	}
	
	/*
	 * save a user in DataBase
	 */
	@PostMapping("users")
	public User createUser(@RequestBody User user) {
		return this.userService.insert(user);
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
	@DeleteMapping("users/{id}")
	public Map<String, Boolean> deleteUser(@PathVariable(value = "id") Long userId){
		
		User user = userRepository.findById(userId).orElseThrow(() ->
		new ResourceNotFoundException("User not found for the id :: " 
				+userId));
		
		this.userRepository.delete(user);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		
		return response;
	}
		
	
}
