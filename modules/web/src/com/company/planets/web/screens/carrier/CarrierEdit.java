package com.company.planets.web.screens.carrier;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.carrier.Carrier;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Carrier.edit")
@UiDescriptor("carrier-edit.xml")
@EditedEntityContainer("carrierDc")
@LoadDataBeforeShow
public class CarrierEdit extends StandardEditor<Carrier> {
}