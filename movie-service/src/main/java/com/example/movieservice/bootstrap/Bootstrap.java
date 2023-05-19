/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.movieservice.bootstrap;

import com.example.movieservice.domain.Genre;
import com.example.movieservice.domain.Movie;
import com.example.movieservice.repository.GenreRepository;
import com.example.movieservice.repository.MovieRepository;
import javax.transaction.Transactional;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 *
 * @author vako
 */
@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final GenreRepository genreRepository;
    private final MovieRepository movieRepository;

    public Bootstrap(GenreRepository genreRepository, MovieRepository movieRepository) {
        this.genreRepository = genreRepository;
        this.movieRepository = movieRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        populate();
    }

    private void populate() {

        Movie horror = new Movie();
        horror.setDate(1990);
        horror.setImdb("7.7");
        horror.setTitle("horror");
        Genre genreHorror = new Genre(); 
        genreHorror.setName("Horror");
        genreHorror.setMovie(horror); 
        genreRepository.save(genreHorror);
        movieRepository.save(horror);

        
             Movie Hangover = new Movie();
        Hangover.setDate(2007);
        Hangover.setImdb("8.7");
        Hangover.setTitle("Hangover");
        Genre genreComedy = new Genre(); 
        genreComedy.setName("Comedy");
        genreComedy.setMovie(Hangover); 
        genreRepository.save(genreComedy);
        movieRepository.save(Hangover);
        
             Movie Hangover2 = new Movie();
        Hangover2.setDate(2008);
        Hangover2.setImdb("6.7");
        Hangover2.setTitle("Hangover2");
        genreComedy.setMovie(Hangover2); 
        genreRepository.save(genreComedy);
        movieRepository.save(Hangover2);
      
             Movie gladiator = new Movie();
        gladiator.setDate(1999);
        gladiator.setImdb("8.7");
        gladiator.setTitle("Gladiator");
        Genre historical = new Genre(); 
        historical.setName("Historical");
        historical.setMovie(gladiator); 
        historical.setMovie(Hangover2);
        genreRepository.save(historical);
        movieRepository.save(gladiator);
       
             Movie Borat = new Movie();
        Borat.setDate(1990);
        Borat.setImdb("7.7");
        Borat.setTitle("The most horror movie u will ever see");
      
        movieRepository.save(Borat);
           /**
             Movie horror = new Movie();
        horror.setDate(1990);
        horror.setImdb("7.7");
        horror.setTitle("The most horror movie u will ever see");
        Genre genreHorror = new Genre(); 
        genreHorror.setName("Horror");
        genreHorror.setMovie(horror); 
        genreRepository.save(genreHorror);
        movieRepository.save(horror);
        
             Movie horror = new Movie();
        horror.setDate(1990);
        horror.setImdb("7.7");
        horror.setTitle("The most horror movie u will ever see");
        Genre genreHorror = new Genre(); 
        genreHorror.setName("Horror");
        genreHorror.setMovie(horror); 
        genreRepository.save(genreHorror);
        movieRepository.save(horror);
        
             Movie horror = new Movie();
        horror.setDate(1990);
        horror.setImdb("7.7");
        horror.setTitle("The most horror movie u will ever see");
        Genre genreHorror = new Genre(); 
        genreHorror.setName("Horror");
        genreHorror.setMovie(horror); 
        genreRepository.save(genreHorror);
        movieRepository.save(horror);
        *  */
    }

}
