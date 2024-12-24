package com.travel.destination.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name ="touristNo_one")
public class EntityOne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long touristID;
    private  String touristName;
    private String  touristplaces;
    private  int Age;

    private  boolean isActive;
    private  String createdBy;
    private LocalDateTime createdData;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
