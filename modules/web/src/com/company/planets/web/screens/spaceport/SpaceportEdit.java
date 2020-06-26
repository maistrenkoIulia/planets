package com.company.planets.web.screens.spaceport;

import com.company.planets.moon.Moon;
import com.company.planets.planet.Planet;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.ValidationException;
import com.haulmont.cuba.gui.screen.*;
import com.company.planets.spaceport.Spaceport;

import javax.inject.Inject;


/**
 * @author maistrenko
 * @version $Id$
 */
@UiController("planets_Spaceport.edit")
@UiDescriptor("spaceport-edit.xml")
@EditedEntityContainer("spaceportDc")
@LoadDataBeforeShow
public class SpaceportEdit extends StandardEditor<Spaceport> {
    @Inject
    private PickerField<Moon> moonField;
    @Inject
    private PickerField<Planet> planetField;


    @Subscribe
    public void onBeforeCommitChanges(BeforeCommitChangesEvent event) {
        if (moonField.getValue() != null && planetField.getValue() != null) {
            throw new ValidationException("Moon and Planet should not be both filled");
        }
    }
}