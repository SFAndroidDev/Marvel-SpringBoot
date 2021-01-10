package com.sfdevs.marvel.service;

import com.sfdevs.marvel.model.CharacterDataWrapper;

/**
 * Defining the methods from Marvel API
 * @author sahar
 *
 */
public interface IMarvelApiService {

	/***
	 * Get the characters info
	 * @return Character wrapper object
	 */
	CharacterDataWrapper getCharacters();
}
