package com.company.planets.atmosphere;

import com.company.planets.atmosphericGas.AtmosphericGas;
import com.company.planets.moon.Moon;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|description")
@Table(name = "PLANETS_ATMOSPHERE")
@Entity(name = "planets_Atmosphere")
public class Atmosphere extends StandardEntity {
    private static final long serialVersionUID = 5645318098639396877L;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "PRESSURE")
    protected Double pressure;

    @OneToMany(mappedBy = "atmosphere")
    protected List<AtmosphericGas> gases;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "atmosphere")
    protected Moon moon;

    public List<AtmosphericGas> getGases() {
        return gases;
    }

    public void setGases(List<AtmosphericGas> gases) {
        this.gases = gases;
    }

    public Moon getMoon() {
        return moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}