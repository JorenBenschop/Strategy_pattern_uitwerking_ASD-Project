package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class checkOrderChipsEvent implements checkEvent {
    @Override
    public boolean checkAnEvent(Event event) {
        return false;
    }
}
