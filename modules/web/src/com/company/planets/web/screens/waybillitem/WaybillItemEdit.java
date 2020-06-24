package com.company.planets.web.screens.waybillitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybillItem.WaybillItem;


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
}