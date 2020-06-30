package com.company.planets.company;

import com.company.planets.customer.Customer;
import com.haulmont.chile.core.annotations.NamePattern;

import javax.persistence.*;

@DiscriminatorValue("COMPANY")
@Table(name = "PLANETS_COMPANY")
@Entity(name = "planets_Company")
@PrimaryKeyJoinColumn(name = "ID", referencedColumnName = "ID")
@NamePattern("%s|name")
public class Company extends Customer {
    private static final long serialVersionUID = -2444277283854103468L;

    @Column(name = "REGISTRATION_ID")
    protected String registrationId;

    @Column(name = "COMPANY_TYPE")
    protected String companyType;

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }
}