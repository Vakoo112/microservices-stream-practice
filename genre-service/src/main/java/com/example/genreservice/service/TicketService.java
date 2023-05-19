/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.genreservice.service;

import com.example.genreservice.domain.Ticket;
import com.example.genreservice.dto.ResponseDto;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vako
 */
public interface TicketService {
    Ticket saveTicket(Ticket ticket);
    ResponseDto getTicket(Long ticketId);
    Map<String, String> findWithEmailAndFirstName();
    List<Ticket> findAllTicketsAdmin();
    List<String> firstNameToUpperCase();
    List<Ticket> filterOnlyGmail();
 
}
