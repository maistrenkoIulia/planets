package com.company.planets.waybillItem;

import com.company.planets.demensions.Demensions;
import com.company.planets.waybill.Waybill;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.EmbeddedParameters;

import javax.persistence.*;
import java.math.BigDecimal;

@NamePattern("%s|name")
@Table(name = "PLANETS_WAYBILL_ITEM")
@Entity(name = "planets_WaybillItem")
public class WaybillItem extends StandardEntity {
    private static final long serialVersionUID = 501791523407951208L;

    @Column(name = "NUMBER_")
    protected Integer number;

    @Column(name = "NAME", unique = true)
    protected String name;

    @Column(name = "WEIGHT")
    protected Double weight;

    @Embedded
    @EmbeddedParameters(nullAllowed = false)
    @AttributeOverrides({
            @AttributeOverride(name = "lenght", column = @Column(name = "DIM_LENGHT")),
            @AttributeOverride(name = "width", column = @Column(name = "DIM_WIDTH")),
            @AttributeOverride(name = "height", column = @Column(name = "DIM_HEIGHT"))
    })
    protected Demensions dim;

    @Column(name = "CHARGE")
    protected BigDecimal charge;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WAYBILL_ID")
    protected Waybill waybill;

    public Waybill getWaybill() {
        return waybill;
    }

    public void setWaybill(Waybill waybill) {
        this.waybill = waybill;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public Demensions getDim() {
        return dim;
    }

    public void setDim(Demensions dim) {
        this.dim = dim;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}