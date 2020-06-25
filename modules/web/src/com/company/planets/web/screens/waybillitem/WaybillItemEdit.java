package com.company.planets.web.screens.waybillitem;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybillItem.WaybillItem;

import javax.inject.Inject;
import java.math.BigDecimal;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_WaybillItem.edit")
@UiDescriptor("waybill-item-edit.xml")
@EditedEntityContainer("waybillItemDc")
@LoadDataBeforeShow
public class WaybillItemEdit extends StandardEditor<WaybillItem> {


    @Inject
    private TextField<Double> weightField;

    protected void calculateCharge() {
        BigDecimal charge = BigDecimal.ZERO;
        BigDecimal weight = BigDecimal.valueOf(weightField.getValue() * 12.3);
        charge = charge.add(weight);

        getEditedEntity().setCharge(charge);
    }

    @Subscribe("weightField")
    public void onWeightFieldValueChange(HasValue.ValueChangeEvent<Double> event) {
        calculateCharge();
    }

}