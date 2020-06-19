package com.company.planets.web.screens.atmosphere;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.atmosphere.Atmosphere;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Atmosphere.browse")
@UiDescriptor("atmosphere-browse.xml")
@LookupComponent("atmospheresTable")
@LoadDataBeforeShow
public class AtmosphereBrowse extends StandardLookup<Atmosphere> {
}