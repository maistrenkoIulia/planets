package com.company.planets.web.screens.waybill;

import com.company.planets.customer.Customer;
import com.company.planets.customerGrade.CustomerGrade;
import com.company.planets.waybillItem.WaybillItem;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.model.CollectionChangeType;
import com.haulmont.cuba.gui.model.CollectionContainer;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybill.Waybill;

import javax.inject.Inject;
import java.math.BigDecimal;


/**
 * @author maistrenko
 * @version $Id$
 */
@UiController("planets_Waybill.edit")
@UiDescriptor("waybill-edit.xml")
@EditedEntityContainer("waybillDc")
@LoadDataBeforeShow
public class WaybillEdit extends StandardEditor<Waybill> {
    @Inject
    private CollectionContainer<WaybillItem> waybillItemsDc;
    @Inject
    private PickerField<Customer> shipperField;

    private double getDiscount() {
        double discount = 0.0;
        Customer customer = shipperField.getValue();
        if (customer != null) {
            CustomerGrade grade = customer.getGrade();
            if (grade == CustomerGrade.GOLD) {
                discount = 0.95;
            } else if (grade == CustomerGrade.SILVER) {
                discount = 0.9;
            } else if (grade == CustomerGrade.BRONZE) {
                discount = 0.8;
            } else {
                discount = 1;
            }
        }
        return discount;
    }

    private void calculateCharge() {
        BigDecimal charge = BigDecimal.ZERO;
        for (WaybillItem item : waybillItemsDc.getItems()) {
            charge = charge.add(item.getCharge());
        }
        double discount = getDiscount();
        double totalChange = Double.parseDouble(String.valueOf(charge)) * discount;
        getEditedEntity().setTotalCharge(BigDecimal.valueOf(totalChange));
    }

    private void calculateWeight() {
        double amount = 0.0;
        for (WaybillItem item : waybillItemsDc.getItems()) {
            amount = amount + item.getWeight();
        }
        getEditedEntity().setTotalWeight(amount);
    }

    @Subscribe(id = "waybillItemsDc", target = Target.DATA_CONTAINER)
    public void onWaybillItemsDcCollectionChange(CollectionContainer.CollectionChangeEvent<WaybillItem> event) {
        calculateWeight();
        calculateCharge();
    }

    @Subscribe("shipperField")
    public void onShipperFieldValueChange(HasValue.ValueChangeEvent<Customer> event) {
        calculateCharge();
    }
}