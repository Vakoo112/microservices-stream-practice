/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.genreservice.controller;

import com.example.genreservice.domain.Ticket;
import com.example.genreservice.dto.ResponseDto;
import com.example.genreservice.service.TicketService;
import java.util.List;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vako
 */
@RequestMapping(TicketController.BASE_URL)
@RestController
public class TicketController {
     public static final String BASE_URL = "/api/ticket";
     private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
     
      @PostMapping
    public ResponseEntity<Ticket> saveUser(@RequestBody Ticket ticket){
        Ticket savedTicket = ticketService.saveTicket(ticket);
        return new ResponseEntity<>(savedTicket, HttpStatus.CREATED);
    }
    
    
    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long ticketId){
        ResponseDto responseDto = ticketService.getTicket(ticketId);
        return ResponseEntity.ok(responseDto);
    }
    
    @GetMapping("/findWithEmailAndFirstName")
    public Map<String, String> findWithEmailAndFirstName(){
        return ticketService.findWithEmailAndFirstName();
    }
    
    @GetMapping("/findAllTicketsAdmin")
    public List<Ticket> findAllTicketsAdmin(){
        return ticketService.findAllTicketsAdmin();
    }
    
    @GetMapping("/firstNameToUpperCase")
     public List<String> firstNameToUpperCase(){
         return ticketService.firstNameToUpperCase();
     }
    
    @GetMapping("/filterOnlyGmail")
     public List<Ticket> filterOnlyGmail(){
         return ticketService.filterOnlyGmail();
     }
    
}
