package com.company.planets.web.screens.atmosphericgas;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.atmosphericGas.AtmosphericGas;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_AtmosphereGas.browse")
@UiDescriptor("atmospheric-gas-browse.xml")
@LookupComponent("atmosphericGasesTable")
@LoadDataBeforeShow
public class AtmosphericGasBrowse extends StandardLookup<AtmosphericGas> {
}