package com.sfdevs.marvel.model;

import java.util.ArrayList;

public class ComicDataContainer {

	 private float offset;
	 private float limit;
	 private float total;
	 private float count;
	 ArrayList<Comic> results = new ArrayList<>();


	 // Getter Methods 

	 public float getOffset() {
	  return offset;
	 }

	 public float getLimit() {
	  return limit;
	 }

	 public float getTotal() {
	  return total;
	 }

	 public float getCount() {
	  return count;
	 }

	 // Setter Methods 

	 public void setOffset(float offset) {
	  this.offset = offset;
	 }

	 public void setLimit(float limit) {
	  this.limit = limit;
	 }

	 public void setTotal(float total) {
	  this.total = total;
	 }

	 public void setCount(float count) {
	  this.count = count;
	 }

	public ArrayList<Comic> getResults() {
		return results;
	}

	public void setResults(ArrayList<Comic> results) {
		this.results = results;
	}
	 
}

