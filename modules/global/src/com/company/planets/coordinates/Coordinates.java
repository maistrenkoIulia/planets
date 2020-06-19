package com.company.planets.coordinates;

import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Coordinates extends EmbeddableEntity {
    private static final long serialVersionUID = 4287582987238365467L;

    @Column(name = "LATITUDE")
    protected Double latitude;

    @Column(name = "LONGITUDE")
    protected Double longitude;

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}