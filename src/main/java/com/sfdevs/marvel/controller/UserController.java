package com.sfdevs.marvel.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdevs.marvel.model.User;
import com.sfdevs.marvel.service.UserService;


@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping("/my-api/v1/u")
public class UserController {
	
	private static final Logger LOG =
            LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;
	
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
	public User update(@PathVariable(value = "id") Long userId, @Valid @RequestBody User user) {
		return userService.update(userId, user);
	}
	
	
	/*
	 * delete a user from DB
	 */
	@DeleteMapping("users/{id}")
	public Map<String, Boolean> deleteById(@PathVariable("id") long id) {
		
		boolean result = userService.deleteById(id);
		
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", result);
		return response;
		
	}
	
	
	
}
