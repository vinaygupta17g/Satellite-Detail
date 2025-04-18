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

    @PostMapping("postsatellite")
    public satellite addSatellite(@RequestBody satellite satellite)
    {
        return satelliteservice.saveSatellite(satellite);
    }

    @GetMapping("getsatellite")
    public List<satellite> getAllStudent()
    {
        return satelliteservice.getSatellite();
    }
    @GetMapping("getsatellite/{id}")
    public satellite getSatelliteById(@PathVariable Integer id)
    {
        return satelliteservice.getSatelliteById(id);
    }
    @GetMapping("getsatellitebyname/{name}")
    public List<satellite> getSatelliteByName(@PathVariable String name)
    {
        return satelliteservice.getSatelliteByName(name);
    }
    @PutMapping("updatesatellite/{id}")
    public satellite updatesatellite(@PathVariable Integer id,@RequestBody satellite satellite)
    {
        return satelliteservice.updatesatellite(id,satellite);
    }
    @DeleteMapping("deletesatellite/{id}")
    public String deletesatellite(@PathVariable Integer id)
    {
        satelliteservice.deletesatellite(id);
        return id+" deleted ";
    }
}