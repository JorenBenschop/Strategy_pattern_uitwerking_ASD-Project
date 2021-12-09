package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.DeliveryEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkDeliveryEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(DeliveryEvent event) throws EventValueIncompleteException {
        Checker.checkEntityUuid(event.getEntityId());
        Checker.checkOrderAmountValidity(event.getOrderAmount());
    }
}