package com.travel.destination.controller;

import com.travel.destination.dto.DtoOne;
import com.travel.destination.entity.EntityOne;
import com.travel.destination.service.ServiceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/tour")
public class ControllerOne {

    @Autowired
    ServiceOne serviceOne;

    @PostMapping("/addData")
    public ResponseEntity<EntityOne>addData(@RequestBody DtoOne dtoOne){
        return new ResponseEntity<>(serviceOne.addData(dtoOne),CREATED);
    }

}
