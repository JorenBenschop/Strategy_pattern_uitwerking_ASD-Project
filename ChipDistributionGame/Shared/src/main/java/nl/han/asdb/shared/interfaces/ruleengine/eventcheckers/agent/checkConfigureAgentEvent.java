package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkConfigureAgentEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(Event event) throws EventValueIncompleteException {
        Checker.checkPeerUuid(event.getPlayerId());
        Checker.checkAgentUuid(event.getAgentUuid());
        Checker.checkAgentName(event.getAgentName());
        Checker.checkAgentCode(event.getAgentCode());
    }

}
