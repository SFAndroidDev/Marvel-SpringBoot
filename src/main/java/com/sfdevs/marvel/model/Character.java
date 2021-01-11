package com.sfdevs.marvel.model;

import java.util.ArrayList;


public class Character {

	private float id;
	 private String name;
	 private String description;
	 private String modified;
	 Thumbnail thumbnail;
	 private String resourceURI;
	 
	 Comics comics;
	 CharacterSerie series;
	 Stories stories;
	 Events events;
	 ArrayList<Object> urls = new ArrayList<Object>();


	 // Getter Methods 

	 public float getId() {
	  return id;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getDescription() {
	  return description;
	 }

	 public String getModified() {
	  return modified;
	 }

	 public Thumbnail getThumbnail() {
	  return thumbnail;
	 }

	 public String getResourceURI() {
	  return resourceURI;
	 }

	 public Comics getComics() {
	  return comics;
	 }

	 public CharacterSerie getSeries() {
	  return series;
	 }

	 public Stories getStories() {
	  return stories;
	 }

	 public Events getEvents() {
	  return events;
	 }

	 // Setter Methods 

	 public void setId(float id) {
	  this.id = id;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setDescription(String description) {
	  this.description = description;
	 }

	 public void setModified(String modified) {
	  this.modified = modified;
	 }

	 public void setThumbnail(Thumbnail thumbnailObject) {
	  this.thumbnail = thumbnailObject;
	 }

	 public void setResourceURI(String resourceURI) {
	  this.resourceURI = resourceURI;
	 }

	 public void setComics(Comics comicsObject) {
	  this.comics = comicsObject;
	 }

	 public void setSeries(CharacterSerie seriesObject) {
	  this.series = seriesObject;
	 }

	 public void setStories(Stories storiesObject) {
	  this.stories = storiesObject;
	 }

	 public void setEvents(Events eventsObject) {
	  this.events = eventsObject;
	 }

	/**
	 * @return the urls
	 */
	public ArrayList<Object> getUrls() {
		return urls;
	}

	/**
	 * @param urls the urls to set
	 */
	public void setUrls(ArrayList<Object> urls) {
		this.urls = urls;
	}
	 
	 
	 
}	