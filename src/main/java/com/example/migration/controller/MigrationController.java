package com.example.migration.controller;

import com.example.migration.model.dto.ResponceApartmentDTO;
import com.example.migration.service.MigrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MigrationController {

    private final MigrationService migrationService;

    @GetMapping("/get_apartment")
    public List<ResponceApartmentDTO> getApartmentByPrice(@RequestParam Integer price) {
        return migrationService.getApartmentByPrice(price);
    }
}