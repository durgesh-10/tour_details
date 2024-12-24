package com.travel.destination.repository;

import com.travel.destination.entity.EntityOne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryOne extends JpaRepository<EntityOne, Long> {
}
