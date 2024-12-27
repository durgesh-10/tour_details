package com.travel.destination.controller;

import com.travel.destination.dto.DtoOne;
import com.travel.destination.entity.EntityOne;
import com.travel.destination.service.ServiceOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/tour")
public class ControllerOne {

    @Autowired
    ServiceOne serviceOne;

    @PostMapping("/addData")
    public ResponseEntity<EntityOne> addData(@RequestBody DtoOne dtoOne) {
        return new ResponseEntity<>(serviceOne.addData(dtoOne), CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTourist(@PathVariable Long id) {
        serviceOne.deleteData(id);
        return ResponseEntity.ok("Tourist deleted successfully");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<EntityOne> updateTourist(@PathVariable Long id, @RequestBody DtoOne dtoOne) {
        EntityOne updatedTourist = serviceOne.updateData(id, dtoOne);
        return ResponseEntity.ok(updatedTourist);
    }

    @GetMapping("/getAllTourists")
    public ResponseEntity<List<EntityOne>> getAllTourists() {
        List<EntityOne> tourists = serviceOne.getAllTourists();
        return ResponseEntity.ok(tourists);
    }


}
