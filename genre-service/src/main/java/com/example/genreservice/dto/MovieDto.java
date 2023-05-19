/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.genreservice.dto;

import lombok.Data;

/**
 *
 * @author vako
 */
@Data
public class MovieDto {

    private Long id;
    private String title;
    private String imdb;
    private int date;
}
