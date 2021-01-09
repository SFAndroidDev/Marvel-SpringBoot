package com.sfdevs.marvel.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.sfdevs.marvel.model.User;
import com.sfdevs.marvel.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	// find all users
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		userRepository.findAll().forEach(users::add);
		return users;
	}
	
	
	//find user by id
	public User findById(Long id) throws ResourceNotFoundException {
		User user = userRepository.findById(id).orElseThrow(() ->
		new ResourceNotFoundException("User not found for the id :: " 
				+id));
		return user;
	}
	
	// add a user
	public User insert(User user) {
		return userRepository.save(user);
	}
	
	// update a user
	public User update(User user) {
		if (user != null && userRepository.existsById(user.getId())) {
			return userRepository.save(user);
		} else {
			return null;
		}
	}
	
}
