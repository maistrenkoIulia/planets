package com.company.planets.astronomicalBody;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;

@NamePattern("%s|name")
@MappedSuperclass
public class AstronomicalBody extends StandardEntity {
    private static final long serialVersionUID = -7452966421664153496L;

    @Column(name = "NAME", unique = true)
    protected String name;

    @Column(name = "MASS")
    protected Double mass;

    @OnDelete(DeletePolicy.UNLINK)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PICTURE_ID")
    protected FileDescriptor picture;

    public void setPicture(FileDescriptor picture) {
        this.picture = picture;
    }

    public FileDescriptor getPicture() {
        return picture;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}