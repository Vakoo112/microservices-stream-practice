/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.movieservice.controller;

import com.example.movieservice.domain.Movie;
import com.example.movieservice.domain.dto.MovieResponseDto;
import com.example.movieservice.service.Mservice;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vako
 */
@RestController
@RequestMapping(MovieController.BASE_URL)
public class MovieController {

    public static final String BASE_URL = "/api/movie";
    private final Mservice mService;

    public MovieController(Mservice mService) {
        this.mService = mService;
    }

    @GetMapping
    public Map<String, String> findWithTitleAndImdb() {
        return mService.findWithTitleAndImdb();
    }

    @GetMapping("/movieyear")
    public List<Integer> findMovieYear() {
        return mService.findMovieYear();
    }

    @GetMapping("/descend")
    public List<Movie> movieWithYear() {
        return mService.movieWithYear();
    }

    @GetMapping("/response")
    public List<MovieResponseDto> movieWithYearModificated() {
        return mService.movieWithYearModificated();
    }
    
    @GetMapping({"/{id}"})
    public Movie byId(@PathVariable Long id){
        return mService.findById(id);
    }
    
}
