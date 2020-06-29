package com.company.planets.core.role;

import com.company.planets.atmosphere.Atmosphere;
import com.company.planets.atmosphericGas.AtmosphericGas;
import com.company.planets.carrier.Carrier;
import com.company.planets.gas.Gas;
import com.company.planets.moon.Moon;
import com.company.planets.planet.Planet;
import com.company.planets.spaceport.Spaceport;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.*;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;
import com.haulmont.cuba.security.role.SpecificPermissionsContainer;

@Role(name = GeneralRole.NAME, isDefault = true, description = "могут просматривать данные планетной системы без возможности редактирования, но учет накладных им недоступен")
public class GeneralRole extends AnnotatedRoleDefinition {
    public final static String NAME = "General";

    @ScreenAccess(screenIds = {"planets_Gas.browse", "application-planets", "planets_AtmosphereGas.browse", "planets_Atmosphere.browse", "planets_Moon.browse", "planets_Planet.browse", "planets_Spaceport.browse"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = Spaceport.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Planet.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Moon.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Gas.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = AtmosphericGas.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Atmosphere.class, operations = EntityOp.READ)
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Spaceport.class, view = "*")
    @EntityAttributeAccess(entityClass = Planet.class, view = "*")
    @EntityAttributeAccess(entityClass = Moon.class, view = "*")
    @EntityAttributeAccess(entityClass = Gas.class, view = "*")
    @EntityAttributeAccess(entityClass = Carrier.class, view = "*")
    @EntityAttributeAccess(entityClass = AtmosphericGas.class, view = "*")
    @EntityAttributeAccess(entityClass = Atmosphere.class, view = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }

    @SpecificAccess(permissions = "cuba.gui.loginToClient")
    @Override
    public SpecificPermissionsContainer specificPermissions() {
        return super.specificPermissions();
    }
}
