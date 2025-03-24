package com.vinay.satellite.models;

import jakarta.persistence.*;

@Entity
@Table(name="satellite")
public class satellite {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Integer satid;
    public String satname;
    public Double satlongitude;
    public Double satlatitude;
    public Double sataltitude;

    public Integer getSatid() {
        return satid;
    }

    public void setSatid(Integer satid) {
        this.satid = satid;
    }

    public String getSatname() {
        return satname;
    }

    public void setSatname(String satname) {
        this.satname = satname;
    }

    public Double getSatlongitude() {
        return satlongitude;
    }

    public void setSatlongitude(Double satlongitude) {
        this.satlongitude = satlongitude;
    }

    public Double getSatlatitude() {
        return satlatitude;
    }

    public void setSatlatitude(Double satlatitude) {
        this.satlatitude = satlatitude;
    }

    public Double getSataltitude() {
        return sataltitude;
    }

    public void setSataltitude(Double sataltitude) {
        this.sataltitude = sataltitude;
    }

    @Override
    public String toString() {
        return "satellite{" +
                "satid=" + satid +
                ", satname='" + satname + '\'' +
                ", satlongitude=" + satlongitude +
                ", satlatitude=" + satlatitude +
                ", sataltitude=" + sataltitude +
                '}';
    }
}
