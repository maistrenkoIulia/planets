package com.company.planets.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.company.Company;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Company.browse")
@UiDescriptor("company-browse.xml")
@LookupComponent("companiesTable")
@LoadDataBeforeShow
public class CompanyBrowse extends StandardLookup<Company> {
}