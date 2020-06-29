package com.company.planets.web.screens.spaceport;

import com.company.planets.moon.Moon;
import com.company.planets.planet.Planet;
import com.haulmont.cuba.gui.components.Button;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.ValidationErrors;
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

    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        if (moonField.getValue() != null && planetField.getValue() != null) {
            errors.add("Moon and Planet should not be both filled");
        }
        super.validateAdditionalRules(errors);
    }
    ValidationErrors errors = null;

    @Subscribe("windowClose")
    public void onWindowCloseClick(Button.ClickEvent event) {
        validateAdditionalRules(errors);
        close(StandardOutcome.CLOSE);

    }


}