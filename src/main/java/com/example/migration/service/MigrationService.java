package com.example.migration.service;

import com.example.migration.model.dto.ResponceApartmentDTO;

import java.util.List;

public interface MigrationService {

    List<ResponceApartmentDTO> getApartmentByPrice(Integer price);
}
