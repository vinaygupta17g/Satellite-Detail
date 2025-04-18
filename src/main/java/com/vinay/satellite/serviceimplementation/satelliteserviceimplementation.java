package com.vinay.satellite.serviceimplementation;

import com.vinay.satellite.models.satellite;
import com.vinay.satellite.repository.satelliterepository;
import com.vinay.satellite.services.satelliteservice;
import org.hibernate.sql.ast.tree.expression.Over;
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
    @Override
    public List<satellite> getSatellite()
    {
        return satelliterepo.findAll();
    }
    @Override
    public satellite getSatelliteById(Integer id)
    {
        return satelliterepo.findById(id).orElseThrow(null);
    }
    @Override
    public List<satellite> getSatelliteByName(String name)
    {
        return satelliterepo.findBySatname(name);
    }
    @Override
    public satellite updatesatellite(Integer id,satellite satellite)
    {
        satellite updatedsatellite = satelliterepo.findById(id).orElseThrow(null);
        updatedsatellite.setSatname(satellite.getSatname());
        updatedsatellite.setSatlongitude(satellite.getSatlongitude());
        updatedsatellite.setSatlatitude(satellite.getSatlatitude());
        updatedsatellite.setSataltitude(satellite.getSataltitude());
        return satelliterepo.save(updatedsatellite);
    }
    @Override
    public void deletesatellite(Integer id)
    {
        satelliterepo.deleteById(id);
    }
}
