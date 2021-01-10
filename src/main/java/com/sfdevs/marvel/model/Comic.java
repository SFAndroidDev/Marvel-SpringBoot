package com.sfdevs.marvel.model;

import java.util.ArrayList;

public class Comic {

	private float id;
	 private float digitalId;
	 private String title;
	 private float issueNumber;
	 private String variantDescription;
	 private String description;
	 private String modified;
	 private String isbn;
	 private String upc;
	 private String diamondCode;
	 private String ean;
	 private String issn;
	 private String format;
	 private float pageCount;
	 ArrayList<TextObject> textObjects = new ArrayList<>();
	 private String resourceURI;
	 ArrayList<Object> urls = new ArrayList<Object>();
	 Serie series;
	 ArrayList<Object> variants = new ArrayList<>();
	 ArrayList<Object> collections = new ArrayList<Object>();
	 ArrayList<Object> collectedIssues = new ArrayList<Object>();
	 ArrayList<Object> dates = new ArrayList<Object>();
	 ArrayList<Object> prices = new ArrayList<Object>();
	 Thumbnail thumbnail;
	 ArrayList<Object> images = new ArrayList<Object>();
	 Creator creators;
	 CharacterComic characters;
	 Stories stories;
	 Events events;


	 // Getter Methods 

	 public float getId() {
	  return id;
	 }

	 public float getDigitalId() {
	  return digitalId;
	 }

	 public String getTitle() {
	  return title;
	 }

	 public float getIssueNumber() {
	  return issueNumber;
	 }

	 public String getVariantDescription() {
	  return variantDescription;
	 }

	 public String getDescription() {
	  return description;
	 }

	 public String getModified() {
	  return modified;
	 }

	 public String getIsbn() {
	  return isbn;
	 }

	 public String getUpc() {
	  return upc;
	 }

	 public String getDiamondCode() {
	  return diamondCode;
	 }

	 public String getEan() {
	  return ean;
	 }

	 public String getIssn() {
	  return issn;
	 }

	 public String getFormat() {
	  return format;
	 }

	 public float getPageCount() {
	  return pageCount;
	 }

	 public String getResourceURI() {
	  return resourceURI;
	 }

	 public Serie getSeries() {
	  return series;
	 }

	 public Thumbnail getThumbnail() {
	  return thumbnail;
	 }

	 public Creator getCreators() {
	  return creators;
	 }

	 public CharacterComic getCharacters() {
	  return characters;
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

	 public void setDigitalId(float digitalId) {
	  this.digitalId = digitalId;
	 }

	 public void setTitle(String title) {
	  this.title = title;
	 }

	 public void setIssueNumber(float issueNumber) {
	  this.issueNumber = issueNumber;
	 }

	 public void setVariantDescription(String variantDescription) {
	  this.variantDescription = variantDescription;
	 }

	 public void setDescription(String description) {
	  this.description = description;
	 }

	 public void setModified(String modified) {
	  this.modified = modified;
	 }

	 public void setIsbn(String isbn) {
	  this.isbn = isbn;
	 }

	 public void setUpc(String upc) {
	  this.upc = upc;
	 }

	 public void setDiamondCode(String diamondCode) {
	  this.diamondCode = diamondCode;
	 }

	 public void setEan(String ean) {
	  this.ean = ean;
	 }

	 public void setIssn(String issn) {
	  this.issn = issn;
	 }

	 public void setFormat(String format) {
	  this.format = format;
	 }

	 public void setPageCount(float pageCount) {
	  this.pageCount = pageCount;
	 }

	 public void setResourceURI(String resourceURI) {
	  this.resourceURI = resourceURI;
	 }

	 public void setSeries(Serie seriesObject) {
	  this.series = seriesObject;
	 }

	 public void setThumbnail(Thumbnail thumbnailObject) {
	  this.thumbnail = thumbnailObject;
	 }

	 public void setCreator(Creator creatorsObject) {
	  this.creators = creatorsObject;
	 }

	 public void setCharacter(CharacterComic charactersObject) {
	  this.characters = charactersObject;
	 }

	 public void setStories(Stories storiesObject) {
	  this.stories = storiesObject;
	 }

	 public void setEvents(Events eventsObject) {
	  this.events = eventsObject;
	 }

	/**
	 * @return the textObjects
	 */
	public ArrayList<TextObject> getTextObjects() {
		return textObjects;
	}

	/**
	 * @param textObjects the textObjects to set
	 */
	public void setTextObjects(ArrayList<TextObject> textObjects) {
		this.textObjects = textObjects;
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

	/**
	 * @return the variants
	 */
	public ArrayList<Object> getVariants() {
		return variants;
	}

	/**
	 * @param variants the variants to set
	 */
	public void setVariants(ArrayList<Object> variants) {
		this.variants = variants;
	}

	/**
	 * @return the collections
	 */
	public ArrayList<Object> getCollections() {
		return collections;
	}

	/**
	 * @param collections the collections to set
	 */
	public void setCollections(ArrayList<Object> collections) {
		this.collections = collections;
	}

	/**
	 * @return the collectedIssues
	 */
	public ArrayList<Object> getCollectedIssues() {
		return collectedIssues;
	}

	/**
	 * @param collectedIssues the collectedIssues to set
	 */
	public void setCollectedIssues(ArrayList<Object> collectedIssues) {
		this.collectedIssues = collectedIssues;
	}

	/**
	 * @return the dates
	 */
	public ArrayList<Object> getDates() {
		return dates;
	}

	/**
	 * @param dates the dates to set
	 */
	public void setDates(ArrayList<Object> dates) {
		this.dates = dates;
	}

	/**
	 * @return the prices
	 */
	public ArrayList<Object> getPrices() {
		return prices;
	}

	/**
	 * @param prices the prices to set
	 */
	public void setPrices(ArrayList<Object> prices) {
		this.prices = prices;
	}

	/**
	 * @return the images
	 */
	public ArrayList<Object> getImages() {
		return images;
	}

	/**
	 * @param images the images to set
	 */
	public void setImages(ArrayList<Object> images) {
		this.images = images;
	}

	/**
	 * @param creators the creators to set
	 */
	public void setCreators(Creator creators) {
		this.creators = creators;
	}

	/**
	 * @param characters the characters to set
	 */
	public void setCharacters(CharacterComic characters) {
		this.characters = characters;
	}
	 
	 
}
