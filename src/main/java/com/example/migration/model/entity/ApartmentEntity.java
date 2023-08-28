package com.example.migration.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "apartment_table")
public class ApartmentEntity {

    @Id
    @SequenceGenerator(name = "apartment_tableSequence", sequenceName = "apartment_table_sequence", allocationSize = 1, initialValue = 4)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "apartment_tableSequence")
    @Column(name = "id")
    private Long id;

    @Column(name = "room_count")
    private Integer roomCount;

    @Column(name = "price")
    private Integer price;

    @Column(name = "total_rating")
    private Integer totalRating;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private AddressEntity addressEntity;
}