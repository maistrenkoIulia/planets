package com.company.planets.core.role;

import com.company.planets.atmosphere.Atmosphere;
import com.company.planets.atmosphericGas.AtmosphericGas;
import com.company.planets.carrier.Carrier;
import com.company.planets.company.Company;
import com.company.planets.customer.Customer;
import com.company.planets.discounts.Discounts;
import com.company.planets.gas.Gas;
import com.company.planets.individual.Individual;
import com.company.planets.moon.Moon;
import com.company.planets.planet.Planet;
import com.company.planets.spaceport.Spaceport;
import com.company.planets.waybill.Waybill;
import com.company.planets.waybillItem.WaybillItem;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.*;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;
import com.haulmont.cuba.security.role.SpecificPermissionsContainer;

@Role(name = ManagerRole.NAME, description = "могут все работать со всеми прикладными объектами системы, но не имеют доступа к администрированию.")
public class ManagerRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Manager";

    @ScreenAccess(screenIds = {"report$Report.browse", "reports", "report$ReportGroup.browse", "report$showChart", "report$Report.run", "report$showPivotTable", "report$showReportTable", "planets_Spaceport.browse", "application-planets", "planets_Company.browse", "planets_Customer.browse", "planets_Individual.browse", "planets_Carrier.browse", "planets_Discounts.browse", "planets_Planet.browse", "planets_Moon.browse", "planets_Atmosphere.browse", "planets_AtmosphereGas.browse", "planets_Gas.browse", "planets_Waybill.browse"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = Atmosphere.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = AtmosphericGas.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Carrier.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Company.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Customer.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Discounts.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Gas.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Individual.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Moon.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Planet.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Spaceport.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Waybill.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = WaybillItem.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Atmosphere.class, view = "*")
    @EntityAttributeAccess(entityClass = AtmosphericGas.class, view = "*")
    @EntityAttributeAccess(entityClass = Carrier.class, view = "*")
    @EntityAttributeAccess(entityClass = Company.class, view = "*")
    @EntityAttributeAccess(entityClass = Customer.class, view = "*")
    @EntityAttributeAccess(entityClass = Discounts.class, view = "*")
    @EntityAttributeAccess(entityClass = Gas.class, view = "*")
    @EntityAttributeAccess(entityClass = Individual.class, view = "*")
    @EntityAttributeAccess(entityClass = Moon.class, view = "*")
    @EntityAttributeAccess(entityClass = Planet.class, view = "*")
    @EntityAttributeAccess(entityClass = Spaceport.class, view = "*")
    @EntityAttributeAccess(entityClass = Waybill.class, modify = "*")
    @EntityAttributeAccess(entityClass = WaybillItem.class, modify = "*")
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
