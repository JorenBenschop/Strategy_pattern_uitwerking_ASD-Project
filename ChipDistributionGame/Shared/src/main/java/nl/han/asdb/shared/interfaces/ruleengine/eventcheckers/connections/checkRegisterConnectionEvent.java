package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class checkRegisterConnectionEvent implements checkEvent {
    @Override
    public boolean checkAnEvent(Event event) {
        return false;
    }
}
