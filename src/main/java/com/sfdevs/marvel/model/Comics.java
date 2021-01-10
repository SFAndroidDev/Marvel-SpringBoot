package com.sfdevs.marvel.model;

import java.util.ArrayList;

public class Comics {

	 private float available;
	 private String collectionURI;
	 ArrayList<ComicsItem> items = new ArrayList<>();
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
	public ArrayList<ComicsItem> getItems() {
		return items;
	}

	/**
	 * @param items the items to set
	 */
	public void setItems(ArrayList<ComicsItem> items) {
		this.items = items;
	}
	 
	 
}
