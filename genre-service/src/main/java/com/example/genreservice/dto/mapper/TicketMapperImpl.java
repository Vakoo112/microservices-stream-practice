/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.genreservice.dto.mapper;

import com.example.genreservice.domain.Ticket;
import com.example.genreservice.dto.TicketDto;
import org.springframework.stereotype.Service;

/**
 *
 * @author vako
 */
@Service
public class TicketMapperImpl implements TicketMapper {

    @Override
    public TicketDto returnMovieDto(Ticket ticket) {
        
        if(ticket == null){
            return null;
        }
        
        TicketDto responseDto = new TicketDto();
        responseDto.setEmail(ticket.getEmail());
        responseDto.setFirstName(ticket.getFirstName());
        responseDto.setLastName(ticket.getLastName());
        responseDto.setId(ticket.getId());
        return responseDto;
        }
    
    
}
