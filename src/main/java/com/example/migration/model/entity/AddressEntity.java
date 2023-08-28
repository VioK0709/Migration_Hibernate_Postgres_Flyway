package com.example.migration.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "address_table")
public class AddressEntity {

    @Id
    @SequenceGenerator(name = "address_tableSequence", sequenceName = "address_table_sequence", allocationSize = 1, initialValue = 4)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_tableSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "street")
    private String street;

    @Column(name = "date_create")
    private LocalDateTime dateCreate;
}