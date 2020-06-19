package com.company.planets.web.screens.individual;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.individual.Individual;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Individual.edit")
@UiDescriptor("individual-edit.xml")
@EditedEntityContainer("individualDc")
@LoadDataBeforeShow
public class IndividualEdit extends StandardEditor<Individual> {
}