package com.travel.destination.service;


import com.travel.destination.dto.DtoOne;
import com.travel.destination.entity.EntityOne;
import com.travel.destination.repository.RepositoryOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOne {

    @Autowired
    private RepositoryOne repositoryOne;

    public EntityOne addData(DtoOne dtoOne){

        EntityOne one = new EntityOne();

        one.setTouristID(dtoOne.getTouristID());
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
}
