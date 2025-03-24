package com.vinay.satellite.serviceimplementation;

import com.vinay.satellite.models.satellite;
import com.vinay.satellite.repository.satelliterepository;
import com.vinay.satellite.services.satelliteservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class satelliteserviceimplementation implements satelliteservice {
    @Autowired
    public satelliterepository satelliterepo;
    @Override
    public satellite saveSatellite(satellite satellite)
    {
        return satelliterepo.save(satellite);
    }
    public List<satellite> getSatellite()
    {
        return satelliterepo.findAll();
    }
}
