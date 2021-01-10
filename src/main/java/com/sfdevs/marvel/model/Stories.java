package com.sfdevs.marvel.model;

import java.util.ArrayList;

public class Stories {
	 private float available;
	 private String collectionURI;
	 ArrayList<Object> items = new ArrayList<>();
	 private float returned;


	 // Getter Methods 

	 public float getAvailable() {
	  return available;
	 }

	 public String getCollectionURI() {
	  return collectionURI;
	 }

	 public float getReturned() {
	  return returned;
	 }

	 // Setter Methods 

	 public void setAvailable(float available) {
	  this.available = available;
	 }

	 public void setCollectionURI(String collectionURI) {
	  this.collectionURI = collectionURI;
	 }

	 public void setReturned(float returned) {
	  this.returned = returned;
	 }

	/**
	 * @return the items
	 */
	public ArrayList<Object> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<Object> items) {
		this.items = items;
	}
	 
	}