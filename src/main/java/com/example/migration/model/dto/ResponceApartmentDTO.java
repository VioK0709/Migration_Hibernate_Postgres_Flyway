package com.example.migration.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ResponceApartmentDTO {

    private String city;

    private String street;

    private LocalDateTime dateCreate;

    private Integer roomCount;

    private Integer price;

    private Integer totalRating;

}
