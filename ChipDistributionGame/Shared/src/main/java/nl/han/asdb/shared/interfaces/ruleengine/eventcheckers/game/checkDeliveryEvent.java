package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.checkEvent;

public class checkDeliveryEvent implements checkEvent {
    @Override
    public boolean checkAnEvent(Event event) {
        return false;
    }
}
