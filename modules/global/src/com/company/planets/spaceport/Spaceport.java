package com.company.planets.spaceport;

import com.company.planets.carrier.Carrier;
import com.company.planets.coordinates.Coordinates;
import com.company.planets.moon.Moon;
import com.company.planets.planet.Planet;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;
import com.haulmont.cuba.core.entity.annotation.PublishEntityChangedEvents;

import javax.persistence.*;
import java.util.List;

@PublishEntityChangedEvents
@NamePattern("%s|name")
@Table(name = "PLANETS_SPACEPORT")
@Entity(name = "planets_Spaceport")
public class Spaceport extends StandardEntity {
    private static final long serialVersionUID = -5512072843230736560L;

    @Column(name = "NAME", unique = true)
    protected String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLANET_ID")
    protected Planet planet;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOON_ID")
    protected Moon moon;

    @Column(name = "IS_DEFAULT")
    protected Boolean isDefault;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "latitude", column = @Column(name = "COORDINATES_LATITUDE")),
            @AttributeOverride(name = "longitude", column = @Column(name = "COORDINATES_LONGITUDE"))
    })
    protected Coordinates coordinates;

    @JoinTable(name = "PLANETS_CARRIER_SPACEPORT_LINK",
            joinColumns = @JoinColumn(name = "SPACEPORT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CARRIER_ID"))
    @ManyToMany
    protected List<Carrier> carriers;

    public List<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(List<Carrier> carriers) {
        this.carriers = carriers;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Moon getMoon() {
        return moon;
    }

    public void setMoon(Moon moon) {
        this.moon = moon;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}