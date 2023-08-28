package com.example.migration.repository;

import com.example.migration.model.entity.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApartmentRepository extends JpaRepository<ApartmentEntity, Long> {

    @Query(nativeQuery = true, value = "select * from apartment_table where price <= :price")
    List<ApartmentEntity> getApartmentByPrice(Integer price);
}
