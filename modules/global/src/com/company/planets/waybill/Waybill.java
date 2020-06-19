package com.company.planets.waybill;

import com.company.planets.carrier.Carrier;
import com.company.planets.customer.Customer;
import com.company.planets.spaceport.Spaceport;
import com.company.planets.waybillItem.WaybillItem;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Table(name = "PLANETS_WAYBILL")
@Entity(name = "planets_Waybill")
public class Waybill extends StandardEntity {
    private static final long serialVersionUID = -5231265491999733848L;

    @Column(name = "REFERENCE")
    protected String reference;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CREATOR_ID")
    protected User creator;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIPPER_ID")
    protected Customer shipper;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONSIGNEE_ID")
    protected Customer consignee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEPARTURE_PORT_ID")
    protected Spaceport departurePort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DESTINATION_PORT_ID")
    protected Spaceport destinationPort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CARRIER_ID")
    protected Carrier carrier;

    @OneToMany(mappedBy = "waybill")
    protected List<WaybillItem> items;

    @Column(name = "TOTAL_WEIGHT")
    protected Double totalWeight;

    @Column(name = "TOTAL_CHARGE")
    protected BigDecimal totalCharge;

    public BigDecimal getTotalCharge() {
        return totalCharge;
    }

    public void setTotalCharge(BigDecimal totalCharge) {
        this.totalCharge = totalCharge;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public List<WaybillItem> getItems() {
        return items;
    }

    public void setItems(List<WaybillItem> items) {
        this.items = items;
    }

    public Carrier getCarrier() {
        return carrier;
    }

    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Spaceport getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(Spaceport destinationPort) {
        this.destinationPort = destinationPort;
    }

    public Spaceport getDeparturePort() {
        return departurePort;
    }

    public void setDeparturePort(Spaceport departurePort) {
        this.departurePort = departurePort;
    }

    public Customer getConsignee() {
        return consignee;
    }

    public void setConsignee(Customer consignee) {
        this.consignee = consignee;
    }

    public Customer getShipper() {
        return shipper;
    }

    public void setShipper(Customer shipper) {
        this.shipper = shipper;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}