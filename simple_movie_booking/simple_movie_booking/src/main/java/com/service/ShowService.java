package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.entity.Show;
import com.repository.MovieRepository;
import com.repository.ShowRepository;

@Service
public class ShowService {
	
	@Autowired
	private ShowRepository showRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	public Show createShow(Show show) {
		Long movieId = show.getMovie().getMovieId();
		Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new RuntimeException("Movie not found"));
		
		show.setMovie(movie);
		return showRepository.save(show);
	}
	
	public List<Show> getAllShows(){
		return showRepository.findAll();
		}
	
	public List<Show> getShowsByMovie(Long movieId){
		Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new RuntimeException("Movie not found"));
		return showRepository.findByMovie(movie);
	}
}
