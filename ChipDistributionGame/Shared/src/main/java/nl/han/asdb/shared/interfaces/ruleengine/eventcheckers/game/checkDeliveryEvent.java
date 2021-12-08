package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.DeliveryEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkDeliveryEvent {
    checker c = new checker();

    public void checkAnEvent(DeliveryEvent event) {
        c.checkEntityUuid(event.getEntityId());
        c.checkOrderAmountValidity(event.getOrderAmount());
    }
}