package com.company.planets.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.customer.Customer;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {
}