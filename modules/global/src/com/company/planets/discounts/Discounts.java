package com.company.planets.discounts;

import com.company.planets.customerGrade.CustomerGrade;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "PLANETS_DISCOUNTS")
@Entity(name = "planets_Discounts")
public class Discounts extends StandardEntity {
    private static final long serialVersionUID = -5264634100545740810L;

    @Column(name = "GRADE")
    protected String grade;

    @Column(name = "VALUE_")
    protected BigDecimal value;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public CustomerGrade getGrade() {
        return grade == null ? null : CustomerGrade.fromId(grade);
    }

    public void setGrade(CustomerGrade grade) {
        this.grade = grade == null ? null : grade.getId();
    }
}