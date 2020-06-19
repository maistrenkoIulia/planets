package com.company.planets.web.screens.planet;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.planet.Planet;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Planet.edit")
@UiDescriptor("planet-edit.xml")
@EditedEntityContainer("planetDc")
@LoadDataBeforeShow
public class PlanetEdit extends StandardEditor<Planet> {
}