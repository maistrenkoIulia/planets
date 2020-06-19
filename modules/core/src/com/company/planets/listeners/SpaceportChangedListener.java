package com.company.planets.listeners;

import com.company.planets.spaceport.Spaceport;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.sun.org.apache.xpath.internal.operations.Bool;
import jdk.nashorn.internal.ir.LiteralNode;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import java.util.UUID;

@Component("planets_SpaceportChangedListener")
public class SpaceportChangedListener {

    @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
    public void beforeCommit(EntityChangedEvent<Spaceport, UUID> event) {
       /* Boolean isDefault = getIsDefault();
        if(isDefault.getValue() == true){
        }*/
    }
}