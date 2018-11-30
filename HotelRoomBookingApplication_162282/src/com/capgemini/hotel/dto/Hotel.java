package com.capgemini.hotel.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hoteldetails")
public class Hotel {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "rating")
	private String rating;
	@Column(name = "rate")
	private double rate;
	@Column(name = "availablerooms")
	private int availablerooms;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getAvailablerooms() {
		return availablerooms;
	}
	public void setAvailablerooms(int availablerooms) {
		this.availablerooms = availablerooms;
	}

}
