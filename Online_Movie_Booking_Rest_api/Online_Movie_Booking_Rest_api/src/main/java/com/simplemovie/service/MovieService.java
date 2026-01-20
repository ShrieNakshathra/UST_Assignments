package com.simplemovie.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Movie;
import com.simplemovie.repository.MovieRepository;


@Service
public class MovieService {


@Autowired
private MovieRepository movieRepository;


public Movie addMovie(Movie movie) {
return movieRepository.save(movie);
}


public List<Movie> getAllMovies() {
return movieRepository.findAll();
}
}