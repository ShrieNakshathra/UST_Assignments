package com.simplemovie.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.ShowRepository;


@Service
public class ShowService {


@Autowired
private ShowRepository showRepository;


public Show createShow(Show show) {
return showRepository.save(show);
}


public List<Show> getAllShows() {
return showRepository.findAll();
}


public List<Show> getShowsByMovie(Long movieId) {
return showRepository.findByMovieMovieId(movieId);
}
}