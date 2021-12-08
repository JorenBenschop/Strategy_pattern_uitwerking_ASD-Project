package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.gamemaster;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class checkSaveCardForReplayEvent implements checkEvent {
    @Override
    public boolean checkAnEvent(Event event) {
        return false;
    }
}
