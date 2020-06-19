package com.company.planets.web.screens.carrier;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.carrier.Carrier;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Carrier.browse")
@UiDescriptor("carrier-browse.xml")
@LookupComponent("carriersTable")
@LoadDataBeforeShow
public class CarrierBrowse extends StandardLookup<Carrier> {
}