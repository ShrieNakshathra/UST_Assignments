package com.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Movie;
import com.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public List<Movie> getAllMovies(){
		return movieRepository.findAll();
	}
	
	
	

}
