package com.entity;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "shows")
public class Show {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long showId;
	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime showTime;
    private Integer totalSeats;
    
    public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	private Integer availableSeats;
    
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    
	public Long getShowId() {
		
		return showId;
	}
	
	public Show() {
    }
	
}
