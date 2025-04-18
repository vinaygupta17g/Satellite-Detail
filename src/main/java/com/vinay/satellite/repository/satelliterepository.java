package com.vinay.satellite.repository;

import com.vinay.satellite.models.satellite;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface satelliterepository extends JpaRepository<satellite,Integer> {
    public List<satellite> findBySatname(String name);
}
