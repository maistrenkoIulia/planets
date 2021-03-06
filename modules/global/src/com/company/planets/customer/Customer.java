package com.company.planets.customer;

import com.company.planets.customerGrade.CustomerGrade;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;

@NamePattern("%s|name")
@Table(name = "PLANETS_CUSTOMER", uniqueConstraints = {
        @UniqueConstraint(name = "IDX_PLANETS_CUSTOMER_ID_UNQ", columnNames = {"DTYPE", "DELETE_TS"})
})
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("CUSTOMER")
@Entity(name = "planets_Customer")
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
public class Customer extends StandardEntity {
    private static final long serialVersionUID = 5188841449931402105L;

    @Column(name = "NAME", unique = true)
    protected String name;

    @Email(message = "incorrect format")
    @Column(name = "EMAIL")
    protected String email;

    @Column(name = "GRADE")
    protected String grade;

    public CustomerGrade getGrade() {
        return grade == null ? null : CustomerGrade.fromId(grade);
    }

    public void setGrade(CustomerGrade grade) {
        this.grade = grade == null ? null : grade.getId();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}