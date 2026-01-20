package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.Movie;

public interface MovieRepository  extends JpaRepository<Movie, Long>{
	

}
