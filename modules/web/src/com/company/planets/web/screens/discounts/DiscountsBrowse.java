package com.company.planets.web.screens.discounts;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.discounts.Discounts;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Discounts.browse")
@UiDescriptor("discounts-browse.xml")
@LookupComponent("discountsesTable")
@LoadDataBeforeShow
public class DiscountsBrowse extends StandardLookup<Discounts> {
}