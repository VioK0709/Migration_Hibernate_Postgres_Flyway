package com.example.migration.mapper;

import com.example.migration.model.dto.ResponceApartmentDTO;
import com.example.migration.model.entity.AddressEntity;
import com.example.migration.model.entity.ApartmentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ApplicationMapper {

    ResponceApartmentDTO entityToDTO(AddressEntity addressEntity, ApartmentEntity apartmentEntity);
}
