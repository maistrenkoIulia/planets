package com.company.planets.web.screens.waybill;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.waybill.Waybill;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Waybill.browse")
@UiDescriptor("waybill-browse.xml")
@LookupComponent("waybillsTable")
@LoadDataBeforeShow
public class WaybillBrowse extends StandardLookup<Waybill> {
}