/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.genreservice.dto.mapper;

import com.example.genreservice.domain.Ticket;
import com.example.genreservice.dto.TicketDto;

/**
 *
 * @author vako
 */
public interface TicketMapper {
       TicketDto returnMovieDto(Ticket ticket);
}
