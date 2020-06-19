package com.company.planets.individual;

import com.company.planets.customer.Customer;
import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "planets_Individual")
@NamePattern("%s|firstName")
public class Individual extends Customer {
    private static final long serialVersionUID = 4020718669857153606L;

    @Column(name = "FIRST_NAME", unique = true)
    protected String firstName;

    @Column(name = "LAST_NAME")
    protected String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}