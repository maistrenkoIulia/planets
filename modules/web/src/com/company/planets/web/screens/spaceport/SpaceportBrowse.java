package com.company.planets.web.screens.spaceport;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.spaceport.Spaceport;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Spaceport.browse")
@UiDescriptor("spaceport-browse.xml")
@LookupComponent("spaceportsTable")
@LoadDataBeforeShow
public class SpaceportBrowse extends StandardLookup<Spaceport> {
}