package com.company.planets.web.screens.company;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.company.Company;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Company.edit")
@UiDescriptor("company-edit.xml")
@EditedEntityContainer("companyDc")
@LoadDataBeforeShow
public class CompanyEdit extends StandardEditor<Company> {
}