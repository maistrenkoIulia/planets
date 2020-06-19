package com.company.planets.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.individual.Individual;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Individual.browse")
@UiDescriptor("individual-browse.xml")
@LookupComponent("individualsTable")
@LoadDataBeforeShow
public class IndividualBrowse extends StandardLookup<Individual> {
}