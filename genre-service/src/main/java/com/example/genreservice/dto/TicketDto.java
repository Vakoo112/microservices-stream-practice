/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.genreservice.dto;

import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

/**
 *
 * @author vako
 */
@Data
public class TicketDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
     private int uniqueCode;
     @CreatedDate
    private Date createdDate;
    private MovieDto movieDto;
}
