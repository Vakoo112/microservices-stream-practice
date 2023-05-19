/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.movieservice.domain.dto;

import com.example.movieservice.domain.Movie;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 *
 * @author vako
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MovieResponseDto {

    private String title;
    private int date;
    private String imdb;
    
    
    public MovieResponseDto returnMovieDto(Movie movie){
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
