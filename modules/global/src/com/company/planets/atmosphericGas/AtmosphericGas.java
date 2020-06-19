package com.company.planets.atmosphericGas;

import com.company.planets.gas.Gas;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "PLANETS_ATMOSPHERE_GAS")
@Entity(name = "planets_AtmosphereGas")
public class AtmosphericGas extends StandardEntity {
    private static final long serialVersionUID = -8236877314408016251L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GAS_ID")
    protected Gas gas;

    @Column(name = "VOLUME")
    protected Double volume;

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