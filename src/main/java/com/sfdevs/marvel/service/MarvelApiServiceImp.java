package com.sfdevs.marvel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sfdevs.marvel.model.CharacterDataWrapper;


/**
 * Marvel API call Implementation
 * @author sahar
 *
 */
@Service("charactersService")
public class MarvelApiServiceImp implements IMarvelApiService {

	private static final Logger LOG = LoggerFactory.getLogger(MarvelApiServiceImp.class);
	
	CharacterDataWrapper resultCharacters = null;
	
	//@Autowired
	//private CharacterRepository characterRepository;
	
	@Value("${config.ts}")
	private int ts;

	@Value("${config.apikey}")
	private String apikey;
	
	@Value("${config.hash}")
	private  String hash;
	
	RestTemplate restTemplate = null;
	
	/***
	 * Constructor
	 */
	public MarvelApiServiceImp() {
		restTemplate = new RestTemplate();
	}
	


	/*
	 * For Marvel API call
	 */
	
	@Override
	public CharacterDataWrapper getCharacters() {
		String url = "https://gateway.marvel.com:443/v1/public/characters?ts=" + ts + "&apikey=" + apikey + "&hash=" + hash;
		LOG.info("Getting the Character data wrapper");
		
		resultCharacters = restTemplate.getForObject(url, CharacterDataWrapper.class);
		
		
		return resultCharacters;
	}


	/*
	public void setCharacters(CharacterDataWrapper characterDataWrapper) {
		// TODO Auto-generated method stub
		
	}*/

}
