package com.example.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {

	@Id
	private int id;

	String name;
	String language;
	String type;
	double rate;
	String imageUrl;

	public Movie(int id, String name, String language, String type, int rate, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.type = type;
		this.rate = rate;
		this.imageUrl = imageUrl;
	}

	public Movie() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
