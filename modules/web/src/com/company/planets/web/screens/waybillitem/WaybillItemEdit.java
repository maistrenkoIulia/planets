package com.company.planets.web.screens.waybillitem;

import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.exception.SilentExceptionHandler;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybillItem.WaybillItem;

import javax.inject.Inject;
import java.math.BigDecimal;


/**
 * @author maistrenko
 * @version $Id$
 */
@UiController("planets_WaybillItem.edit")
@UiDescriptor("waybill-item-edit.xml")
@EditedEntityContainer("waybillItemDc")
@LoadDataBeforeShow
public class WaybillItemEdit extends StandardEditor<WaybillItem> {


    @Inject
    private TextField<Double> dimFieldWidth;
    @Inject
    private TextField<Double> dimFieldLenght;
    @Inject
    private TextField<Double> dimFieldHeight;
    @Inject
    private TextField<Double> weightField;

    protected void calculateCharge() {
        BigDecimal charge = BigDecimal.ZERO;
        BigDecimal total = BigDecimal.valueOf(weightField.getValue() * 12.3 + dimFieldWidth.getValue() * 3.4 +
                dimFieldLenght.getValue() * 0.98 + dimFieldHeight.getValue() * 12);
        charge = charge.add(total);

        getEditedEntity().setCharge(charge);
    }

    @Subscribe
    public void onBeforeClose(BeforeCloseEvent event) {
        calculateCharge();

    }

    @Subscribe("weightField")
    public void onWeightFieldValueChange(HasValue.ValueChangeEvent<Double> event) {
        calculateCharge();
    }

    @Subscribe("dimFieldHeight")
    public void onDimFieldHeightValueChange(HasValue.ValueChangeEvent<Double> event) {
        calculateCharge();
    }

    @Subscribe("dimFieldLenght")
    public void onDimFieldLenghtValueChange(HasValue.ValueChangeEvent<Double> event) {
        calculateCharge();
    }

    @Subscribe("dimFieldWidth")
    public void onDimFieldWidthValueChange(HasValue.ValueChangeEvent<Double> event) {
        calculateCharge();
    }

}