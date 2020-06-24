package com.company.planets.web.screens.waybillitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybillItem.WaybillItem;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_WaybillItem.browse")
@UiDescriptor("waybill-item-browse.xml")
@LookupComponent("waybillItemsTable")
@LoadDataBeforeShow
public class WaybillItemBrowse extends StandardLookup<WaybillItem> {
}