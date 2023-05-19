/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.genreservice.service;

import com.example.genreservice.domain.Ticket;
import com.example.genreservice.dto.MovieDto;
import com.example.genreservice.dto.ResponseDto;
import com.example.genreservice.dto.TicketDto;
import com.example.genreservice.dto.mapper.TicketMapper;
import com.example.genreservice.repository.TicketRepository;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author vako
 */
@Service
public class TickerServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;
    private final RestTemplate restTemplate;
    private final TicketMapper ticketMapper;

    public TickerServiceImpl(TicketRepository ticketRepository,
            RestTemplate restTemplate, TicketMapper ticketMapper) {
        this.ticketRepository = ticketRepository;
        this.restTemplate = restTemplate;
        this.ticketMapper = ticketMapper;
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        ticket.setUniqueCode(generateUniqueHashCode());               
        return ticketRepository.save(ticket);
    }

    @Override
    public ResponseDto getTicket(Long ticketId) {
        ResponseDto response = new ResponseDto();
        Ticket ticket = ticketRepository.findById(ticketId).get();
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();

        ResponseEntity<MovieDto> responseEntity = restTemplate
                .getForEntity("http://localhost:8181/api/movie/" + ticket.getMovieId(),
                        MovieDto.class);
        MovieDto movie = responseEntity.getBody();
        TicketDto ticketDto = ticketMapper.returnMovieDto(ticket);
        ticketDto.setMovieDto(movie);
        ticketDto.setUniqueCode(ticket.getUniqueCode());
        ticketDto.setCreatedDate(date);
        response.setTicket(ticketDto);
        return response;

    }

    @Override
    public Map<String, String> findWithEmailAndFirstName() {
        return ticketRepository.findAll().stream()
                .collect(Collectors.toMap(Ticket::getEmail, Ticket::getFirstName));
    }

    @Override
    public List<Ticket> findAllTicketsAdmin() {
        List<Ticket> listOfTickets = ticketRepository.findAll().stream().collect(Collectors.toList());
        return listOfTickets;
    }

    @Override
    public List<String> firstNameToUpperCase() {
        List<String> listOfTickets = ticketRepository
                .findAll().stream().map(ticket -> ticket.getFirstName().toUpperCase())
                .collect(Collectors.toList());
        return listOfTickets;
    }

    @Override
    public List<Ticket> filterOnlyGmail() {
        List<Ticket> listOfGmail = ticketRepository.findAll()
                .stream().filter(ticket -> ticket.getEmail().contains("@gmail.com"))
                .collect(Collectors.toList());
        return listOfGmail;
    }

   
    

    private int generateUniqueHashCode() {
        Random rand = new Random();
        int unique = rand.nextInt(100000);
        return unique;
    }

}
