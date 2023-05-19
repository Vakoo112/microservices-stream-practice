/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.movieservice.service;

import com.example.movieservice.domain.Movie;
import com.example.movieservice.domain.dto.MovieResponseDto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vako
 */
public interface Mservice {

    Map<String, String> findWithTitleAndImdb();

    List<Integer> findMovieYear();

    List<Movie> movieWithYear();

    List<MovieResponseDto> movieWithYearModificated();
    
    Movie findById (Long id);
}
