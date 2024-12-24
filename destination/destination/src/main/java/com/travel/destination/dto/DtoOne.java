package com.travel.destination.dto;

import jakarta.persistence.Column;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DtoOne {
    private Long touristID;
    private  String touristName;
    private String  touristplaces;
    @Column(nullable = false)
    private Integer age;

    private  boolean isActive;
    private  String createdBy;
    private LocalDateTime createdData;
    private String updatedBy;
    private LocalDateTime updatedDate;
}
