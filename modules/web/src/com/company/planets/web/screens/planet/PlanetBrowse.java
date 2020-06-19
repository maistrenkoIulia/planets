package com.company.planets.web.screens.planet;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.planet.Planet;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Planet.browse")
@UiDescriptor("planet-browse.xml")
@LookupComponent("planetsTable")
@LoadDataBeforeShow
public class PlanetBrowse extends StandardLookup<Planet> {
}