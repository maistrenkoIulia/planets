package com.company.planets.gas;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NamePattern("%s|name")
@Table(name = "PLANETS_GAS")
@Entity(name = "planets_Gas")
public class Gas extends StandardEntity {
    private static final long serialVersionUID = 5866871400970822445L;

    @Column(name = "NAME", unique = true)
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}