package com.company.planets.web.screens.customer;

import com.haulmont.cuba.gui.screen.*;
import com.company.planets.customer.Customer;


/**
 *@author maistrenko
 *
 *@version $Id$
 */
@UiController("planets_Customer.edit")
@UiDescriptor("customer-edit.xml")
@EditedEntityContainer("customerDc")
@LoadDataBeforeShow
public class CustomerEdit extends StandardEditor<Customer> {
}