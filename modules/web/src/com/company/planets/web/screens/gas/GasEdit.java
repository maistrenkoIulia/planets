package com.company.planets.web.screens.gas;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.gas.Gas;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Gas.edit")
@UiDescriptor("gas-edit.xml")
@EditedEntityContainer("gasDc")
@LoadDataBeforeShow
public class GasEdit extends StandardEditor<Gas> {
}