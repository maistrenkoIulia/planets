package com.company.planets.web.screens.gas;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.gas.Gas;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Gas.browse")
@UiDescriptor("gas-browse.xml")
@LookupComponent("gasesTable")
@LoadDataBeforeShow
public class GasBrowse extends StandardLookup<Gas> {
}