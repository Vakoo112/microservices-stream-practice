/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.movieservice.service;

import com.example.movieservice.domain.Movie;
import com.example.movieservice.domain.dto.MovieMapper;
import com.example.movieservice.domain.dto.MovieResponseDto;
import com.example.movieservice.repository.GenreRepository;
import com.example.movieservice.repository.MovieRepository;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author vako
 */
@Service
public class MovieService implements Mservice {

    private final GenreRepository genreRepository;
    private final MovieRepository movieRepository;
    private final MovieMapper movieMapper;

    public MovieService(GenreRepository genreRepository, MovieRepository movieRepository, MovieMapper movieMapper) {
        this.genreRepository = genreRepository;
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public Map<String, String> findWithTitleAndImdb() {
        return movieRepository.findAll().stream()
                .collect(Collectors.toMap(Movie::getTitle, Movie::getImdb));
    }

    @Override
    public List<Integer> findMovieYear() {
        List<Integer> years = movieRepository.findAll()
                .stream().map(movie -> movie.getDate()).collect(Collectors.toList());

        List<Integer> descendinOrder = years.stream().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return descendinOrder;
    }

    @Override
    public List<Movie> movieWithYear() {
        List<Movie> allMovies = movieRepository.findAll().stream()
                .sorted(Comparator.comparing(Movie::getDate).reversed().thenComparing(Movie::getTitle))
                .collect(Collectors.toList());
        return allMovies;
    }

    //filter id 
    @Override
    public List<MovieResponseDto> movieWithYearModificated() {
        List<MovieResponseDto> allMovies = movieRepository.findAll().stream()
                .map(movie -> {
                    MovieResponseDto newM = new MovieResponseDto();

                    newM = movieMapper.returnMovieDto(movie);
                    return newM;

                }).collect(Collectors.toList());

        return allMovies;

    }

    @Override
    public Movie findById(Long id) {
       Movie movieToFind = movieRepository.findById(id).get();
       return movieToFind;
    }
    

}
