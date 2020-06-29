package com.company.planets.web.screens.waybillitem;

import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.exception.SilentExceptionHandler;
import com.haulmont.cuba.gui.model.DataContext;
import com.haulmont.cuba.gui.model.InstanceContainer;
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

    public double getWeight() {
        if(weightField.getValue() == null){
            return 0.0;
        }
        else{
            return weightField.getValue();
        }
    }

    public double getWidth() {
        if(dimFieldWidth.getValue() == null){
            return 0.0;
        }
        else{
            return dimFieldWidth.getValue();
        }
    }

    public double getLenght() {
        if( dimFieldLenght.getValue() == null){
            return 0.0;
        }
        else{
            return  dimFieldLenght.getValue();
        }
    }

    public double getHeight() {
        if( dimFieldHeight.getValue() == null){
            return 0.0;
        }
        else{
            return  dimFieldHeight.getValue();
        }
    }

    protected void calculateCharge() {
        BigDecimal charge = BigDecimal.ZERO;
        BigDecimal total = BigDecimal.valueOf(getWeight() * 12.3 + getWidth() * 3.4 +
                getLenght() * 0.98 + getHeight() * 12);
        charge = charge.add(total);

        getEditedEntity().setCharge(charge);
    }

    @Subscribe(id = "waybillItemDc", target = Target.DATA_CONTAINER)
    public void onWaybillItemDcItemPropertyChange(InstanceContainer.ItemPropertyChangeEvent<WaybillItem> event) {
        calculateCharge();
    }
}