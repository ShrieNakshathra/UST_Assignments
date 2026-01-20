package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.Show;
import com.service.ShowService;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    @Autowired
    private ShowService showService;

    // API 3: Create Show
    @PostMapping
    public Show createShow(@RequestBody Show show) {
        return showService.createShow(show);
    }

    // API 4: Get All Shows
    @GetMapping
    public List<Show> getAllShows() {
        return showService.getAllShows();
    }

    // API 5: Get Shows by Movie
    @GetMapping("/movie/{movieId}")
    public List<Show> getShowsByMovie(@PathVariable Long movieId) {
        return showService.getShowsByMovie(movieId);
    }
}
