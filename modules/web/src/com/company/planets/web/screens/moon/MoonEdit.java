package com.company.planets.web.screens.moon;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.moon.Moon;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Moon.edit")
@UiDescriptor("moon-edit.xml")
@EditedEntityContainer("moonDc")
@LoadDataBeforeShow
public class MoonEdit extends StandardEditor<Moon> {
}