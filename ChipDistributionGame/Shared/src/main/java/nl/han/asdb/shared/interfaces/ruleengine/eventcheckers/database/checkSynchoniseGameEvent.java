package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.database;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.checkEvent;

public class checkSynchoniseGameEvent implements checkEvent {
    @Override
    public boolean checkAnEvent(Event event) {
        return false;
    }
}
