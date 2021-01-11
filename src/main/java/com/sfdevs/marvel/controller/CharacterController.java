package com.sfdevs.marvel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sfdevs.marvel.service.IMarvelApiService;


@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping("/my-api/v1")
public class CharacterController {
	
	private static final Logger LOG =
            LoggerFactory.getLogger(CharacterController.class);

	
	@Autowired
	private IMarvelApiService characterService;
	
	
	/***
	 * Get Characters Info from Marvel api
	 * @return character data wrapper
	 */
	@GetMapping("/characters")
	public ResponseEntity<?> getCharacters() {
		try {
			return ResponseEntity.ok(characterService.getCharacters());
		}catch (Exception e) {
			LOG.error(e.getMessage());
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NO_CONTENT);
		}
	}
		
	
}
