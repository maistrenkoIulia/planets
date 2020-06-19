package com.company.planets.web.screens.atmosphere;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.atmosphere.Atmosphere;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Atmosphere.edit")
@UiDescriptor("atmosphere-edit.xml")
@EditedEntityContainer("atmosphereDc")
@LoadDataBeforeShow
public class AtmosphereEdit extends StandardEditor<Atmosphere> {
}