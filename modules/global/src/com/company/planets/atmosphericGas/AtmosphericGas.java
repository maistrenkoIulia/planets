package com.company.planets.atmosphericGas;

import com.company.planets.atmosphere.Atmosphere;
import com.company.planets.gas.Gas;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.NumberFormat;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamePattern("%s|gas")
@Table(name = "PLANETS_ATMOSPHERE_GAS")
@Entity(name = "planets_AtmosphereGas")
public class AtmosphericGas extends StandardEntity {
    private static final long serialVersionUID = -8236877314408016251L;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "GAS_ID", unique = true)
    protected Gas gas;

    @NotNull
    @NumberFormat(pattern = "##.##")
    @Column(name = "VOLUME", nullable = false)
    protected Double volume;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ATMOSPHERE_ID")
    protected Atmosphere atmosphere;

    public Atmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(Atmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Gas getGas() {
        return gas;
    }

    public void setGas(Gas gas) {
        this.gas = gas;
    }
}