/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.movieservice.response;

import java.util.Map;

/**
 *
 * @author vako
 */
public class ListResponse {
  
    Map<String,String> values;
     public ListResponse(Map<String, String> findWithTitleAndImdb) {
        this.values =findWithTitleAndImdb;
    }
}
