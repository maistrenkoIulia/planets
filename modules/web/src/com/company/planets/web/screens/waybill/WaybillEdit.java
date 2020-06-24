package com.company.planets.web.screens.waybill;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybill.Waybill;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Waybill.edit")
@UiDescriptor("waybill-edit.xml")
@EditedEntityContainer("waybillDc")
@LoadDataBeforeShow
public class WaybillEdit extends StandardEditor<Waybill> {
}