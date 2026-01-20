package com.simplemovie.entity;


import java.time.LocalDateTime;
import jakarta.persistence.*;


@Entity
@Table(name = "shows")
public class Show {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long showId;


private LocalDateTime showTime;
private int totalSeats;
private int availableSeats;


@ManyToOne
@JoinColumn(name = "movie_id")
private Movie movie;


public Long getShowId() {
	return showId;
}


public void setShowId(Long showId) {
	this.showId = showId;
}


public LocalDateTime getShowTime() {
	return showTime;
}


public void setShowTime(LocalDateTime showTime) {
	this.showTime = showTime;
}


public int getTotalSeats() {
	return totalSeats;
}


public void setTotalSeats(int totalSeats) {
	this.totalSeats = totalSeats;
}


public int getAvailableSeats() {
	return availableSeats;
}


public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
}


public Movie getMovie() {
	return movie;
}


public void setMovie(Movie movie) {
	this.movie = movie;
}


// getters and setters

}