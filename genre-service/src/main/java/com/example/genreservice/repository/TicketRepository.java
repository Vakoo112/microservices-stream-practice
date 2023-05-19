/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.genreservice.repository;

import com.example.genreservice.domain.Ticket;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vako
 */
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findTicketByUniqueCode(int uniqueCode);
}
