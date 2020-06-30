package com.company.planets.web.screens.customer;

import com.company.planets.company.Company;
import com.company.planets.individual.Individual;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.ScreenBuilders;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.planets.customer.Customer;

import javax.inject.Inject;


/**
 * @author maistrenko
 * @version $Id$
 */
@UiController("planets_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
@LoadDataBeforeShow
public class CustomerBrowse extends StandardLookup<Customer> {

    @Inject
    protected Metadata metadata;
    @Inject
    private ScreenBuilders screenBuilders;
    @Inject
    private GroupTable<Customer> customersTable;

    @Subscribe("createBtn.createIndividual")
    protected void onCreateBtnCreateIndividual(Action.ActionPerformedEvent event) {
        Individual individual = metadata.create(Individual.class);
        showCreateEditorForCustomer(individual);
    }

    @Subscribe("createBtn.createCompany")
    public void onCreateBtnCreateCompany(Action.ActionPerformedEvent event) {
        Company company = metadata.create(Company.class);
        showCreateEditorForCustomer(company);
    }

    private void showCreateEditorForCustomer(Customer customer) {
        screenBuilders.editor(customersTable)
                .editEntity(customer)
                .build()
                .show();
    }


}