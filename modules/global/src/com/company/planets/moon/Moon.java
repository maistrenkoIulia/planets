package com.company.planets.moon;

import com.company.planets.astronomicalBody.AstronomicalBody;
import com.company.planets.atmosphere.Atmosphere;
import com.company.planets.planet.Planet;

import javax.persistence.*;

@Table(name = "PLANETS_MOON")
@Entity(name = "planets_Moon")
public class Moon extends AstronomicalBody {
    private static final long serialVersionUID = 6509905946014330288L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLANET_ID")
    protected Planet planet;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATMOSPHERE_ID")
    protected Atmosphere atmosphere;

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Planet getPlanet() {
        return planet;
    }

    public void setPlanet(Planet planet) {
        this.planet = planet;
    }
}