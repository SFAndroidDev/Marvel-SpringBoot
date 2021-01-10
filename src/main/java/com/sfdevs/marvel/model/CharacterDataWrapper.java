package com.sfdevs.marvel.model;

public class CharacterDataWrapper {
	 
	 private float code;
	 private String status;
	 private String copyright;
	 private String attributionText;
	 private String attributionHTML;
	 private String etag;
	 CharacterDataContainer data;


	 // Getter Methods 

	 public float getCode() {
	  return code;
	 }

	 public String getStatus() {
	  return status;
	 }

	 public String getCopyright() {
	  return copyright;
	 }

	 public String getAttributionText() {
	  return attributionText;
	 }

	 public String getAttributionHTML() {
	  return attributionHTML;
	 }

	 public String getEtag() {
	  return etag;
	 }

	 public CharacterDataContainer getData() {
	  return data;
	 }

	 // Setter Methods 

	 public void setCode(float code) {
	  this.code = code;
	 }

	 public void setStatus(String status) {
	  this.status = status;
	 }

	 public void setCopyright(String copyright) {
	  this.copyright = copyright;
	 }

	 public void setAttributionText(String attributionText) {
	  this.attributionText = attributionText;
	 }

	 public void setAttributionHTML(String attributionHTML) {
	  this.attributionHTML = attributionHTML;
	 }

	 public void setEtag(String etag) {
	  this.etag = etag;
	 }

	 public void setData(CharacterDataContainer dataObject) {
	  this.data = dataObject;
	 }
}
