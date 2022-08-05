package com.bharath.demo.entity;

import java.util.List;

public class UserEntity {

	
	private int id;
	private String username;
	private String password;
	private List<MovieEntity> bookedMovie;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<MovieEntity> getBookedMovie() {
		return bookedMovie;
	}
	public void setBookedMovie(List<MovieEntity> bookedMovie) {
		this.bookedMovie = bookedMovie;
	}
	
	
	
}
