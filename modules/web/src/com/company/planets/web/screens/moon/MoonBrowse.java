package com.company.planets.web.screens.moon;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.moon.Moon;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Moon.browse")
@UiDescriptor("moon-browse.xml")
@LookupComponent("moonsTable")
@LoadDataBeforeShow
public class MoonBrowse extends StandardLookup<Moon> {
}