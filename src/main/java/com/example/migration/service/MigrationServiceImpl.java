package com.example.migration.service;

import com.example.migration.mapper.ApplicationMapper;
import com.example.migration.model.dto.ResponceApartmentDTO;
import com.example.migration.model.entity.ApartmentEntity;
import com.example.migration.repository.ApartmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MigrationServiceImpl implements MigrationService{

    private final ApartmentRepository apartmentRepository;
    private final ApplicationMapper applicationMapper;
    @Override
    public List<ResponceApartmentDTO> getApartmentByPrice(Integer price) {
        List<ApartmentEntity> apartmentByPrice = apartmentRepository.getApartmentByPrice(price);
        List<ResponceApartmentDTO> collect = apartmentByPrice.stream()
                .map(o -> applicationMapper.entityToDTO(o.getAddressEntity(), o))
                .collect(Collectors.toList());
        return collect;
    }
}
