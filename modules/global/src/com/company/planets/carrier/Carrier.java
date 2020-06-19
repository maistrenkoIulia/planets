package com.company.planets.carrier;

import com.company.planets.spaceport.Spaceport;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "PLANETS_CARRIER")
@Entity(name = "planets_Carrier")
public class Carrier extends StandardEntity {
    private static final long serialVersionUID = 1454855223606096215L;

    @Column(name = "NAME", unique = true)
    protected String name;

    @JoinTable(name = "PLANETS_CARRIER_SPACEPORT_LINK",
            joinColumns = @JoinColumn(name = "CARRIER_ID"),
            inverseJoinColumns = @JoinColumn(name = "SPACEPORT_ID"))
    @ManyToMany
    protected List<Spaceport> ports;

    public List<Spaceport> getPorts() {
        return ports;
    }

    public void setPorts(List<Spaceport> ports) {
        this.ports = ports;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}