package com.vinay.satellite.controller;

import com.vinay.satellite.models.satellite;
import com.vinay.satellite.services.satelliteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/satellite")
public class satellitecontroller {

    @Autowired
    private satelliteservice satelliteservice;

    @PostMapping
    public satellite addSatellite(@RequestBody satellite satellite)
    {
        return satelliteservice.saveSatellite(satellite);
    }

    @GetMapping
    public List<satellite> getAllStudent()
    {
        return satelliteservice.getSatellite();
    }
}