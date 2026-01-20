package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	public Movie(String title, String genre, Integer duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
	public Movie() {
		
	} 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long movieId;
	private String title;
	private String genre;
	private Integer duration;
	public Long getMovieId() {
		return movieId;
	}
	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

}
