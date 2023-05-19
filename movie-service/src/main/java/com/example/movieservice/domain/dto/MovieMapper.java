/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.movieservice.domain.dto;

import com.example.movieservice.domain.Movie;

/**
 *
 * @author vako
 */
public interface MovieMapper {
    public MovieResponseDto returnMovieDto(Movie movie);
}
