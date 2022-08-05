package com.bharath.demo.entity;

import java.util.List;

public class MovieEntity {
	

	private int id;
	private String name;
	private List<Integer> availableSeats;
	
	
	
	public List<Integer> getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(List<Integer> availableSeats) {
		this.availableSeats = availableSeats;
	}
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

	
	public MovieEntity(int id, String name, List<Integer> availableSeats) {
		super();
		this.id = id;
		this.name = name;
		this.availableSeats = availableSeats;
	}
	public MovieEntity() {
		super();
	}
	@Override
	public String toString() {
		return "MovieEntity [id=" + id + ", name=" + name + ", availableSeats=" + availableSeats
				+ "]";
	}
	

}
