package com.travel.destination.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DtoOne {
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
