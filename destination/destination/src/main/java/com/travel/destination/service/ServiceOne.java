package com.travel.destination.service;


import com.travel.destination.dto.DtoOne;
import com.travel.destination.entity.EntityOne;
import com.travel.destination.repository.RepositoryOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceOne {

    @Autowired
    private RepositoryOne repositoryOne;

    public EntityOne addData(DtoOne dtoOne){

        EntityOne one = new EntityOne();

        one.setTouristName(dtoOne.getTouristName());
        one.setTouristplaces(dtoOne.getTouristplaces());
        one.setAge(dtoOne.getAge());

        one.setActive(true);
        one.setCreatedBy(dtoOne.getCreatedBy());
        one.setCreatedData(dtoOne.getCreatedData());
        one.setUpdatedBy(dtoOne.getUpdatedBy());
        one.setUpdatedDate(dtoOne.getUpdatedDate());

        return repositoryOne.save(one);

    }
    public void deleteData(Long id) {
        if (!repositoryOne.existsById(id)) {
            throw new RuntimeException("Tourist with ID " + id + " does not exist.");
        }
        repositoryOne.deleteById(id);
    }

    public EntityOne updateData(Long id, DtoOne dtoOne) {
        EntityOne existingTourist = repositoryOne.findById(id)
                .orElseThrow(() -> new RuntimeException("Tourist with ID " + id + " not found."));

        existingTourist.setTouristName(dtoOne.getTouristName());
        existingTourist.setTouristplaces(dtoOne.getTouristplaces());
        existingTourist.setAge(dtoOne.getAge());
        existingTourist.setUpdatedBy(dtoOne.getUpdatedBy());
        existingTourist.setUpdatedDate(dtoOne.getUpdatedDate());

        return repositoryOne.save(existingTourist);
    }

    public List<EntityOne> getAllTourists() {
        return repositoryOne.findAll();
    }

}
