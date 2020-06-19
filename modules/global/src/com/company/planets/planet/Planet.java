package com.company.planets.planet;

import com.company.planets.astronomicalBody.AstronomicalBody;
import com.company.planets.atmosphere.Atmosphere;

import javax.persistence.*;

@Table(name = "PLANETS_PLANET")
@Entity(name = "planets_Planet")
public class Planet extends AstronomicalBody {
    private static final long serialVersionUID = -5717540379979055056L;

    @Column(name = "SEMI_MAJOR_AXIS")
    protected Double semiMajorAxis;

    @Column(name = "ORBITAL_PERIOD")
    protected Double orbitalPeriod;

    @Column(name = "ROTATION_PERIOD")
    protected Double rotationPeriod;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATMOSPHERE_ID")
    protected Atmosphere atmosphere;

    @Column(name = "RINGS")
    protected Boolean rings;

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public Boolean getRings() {
        return rings;
    }

    public void setRings(Boolean rings) {
        this.rings = rings;
    }

    public Double getRotationPeriod() {
        return rotationPeriod;
    }

    public void setRotationPeriod(Double rotationPeriod) {
        this.rotationPeriod = rotationPeriod;
    }

    public Double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(Double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    public Double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(Double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }
}