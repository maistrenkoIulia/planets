package com.company.planets.demensions;

import com.haulmont.cuba.core.entity.EmbeddableEntity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Demensions extends EmbeddableEntity {
    private static final long serialVersionUID = -2006525440019317843L;

    @Column(name = "LENGHT")
    protected Double lenght;

    @Column(name = "WIDTH")
    protected Double width;

    @Column(name = "HEIGHT")
    protected Double height;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }
}