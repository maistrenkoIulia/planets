package com.company.planets.web.screens.discounts;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.discounts.Discounts;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Discounts.edit")
@UiDescriptor("discounts-edit.xml")
@EditedEntityContainer("discountsDc")
@LoadDataBeforeShow
public class DiscountsEdit extends StandardEditor<Discounts> {
}