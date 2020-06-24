package com.company.planets.web.screens.atmosphericgas;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.atmosphericGas.AtmosphericGas;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_AtmosphereGas.edit")
@UiDescriptor("atmospheric-gas-edit.xml")
@EditedEntityContainer("atmosphericGasDc")
@LoadDataBeforeShow
public class AtmosphericGasEdit extends StandardEditor<AtmosphericGas> {
}