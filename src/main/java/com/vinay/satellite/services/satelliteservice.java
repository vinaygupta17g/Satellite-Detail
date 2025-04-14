package com.vinay.satellite.services;

import com.vinay.satellite.models.satellite;
import java.util.List;
public interface satelliteservice {
    satellite saveSatellite(satellite satellite);
    List<satellite> getSatellite();
}
