package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkStartAgentEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(Event event) throws EventValueIncompleteException {
        checkAgentUuid(event.getAgentUuid());
        checkPlayerUuid(event.getPlayerId());
    }
}
