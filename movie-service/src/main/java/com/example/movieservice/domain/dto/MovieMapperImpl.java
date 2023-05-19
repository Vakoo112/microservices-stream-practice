/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.movieservice.domain.dto;

import com.example.movieservice.domain.Movie;
import org.springframework.stereotype.Component;

/**
 *
 * @author vako
 */
@Component
public class MovieMapperImpl implements MovieMapper {

    @Override
    public MovieResponseDto returnMovieDto(Movie movie) {

        if(movie ==null){
            return null;
        }
        MovieResponseDto newMovie = new MovieResponseDto();
        newMovie.setDate(movie.getDate());
        newMovie.setImdb(movie.getImdb());
        newMovie.setTitle(movie.getTitle());
        
        return newMovie;
        
    }
    
    
}
