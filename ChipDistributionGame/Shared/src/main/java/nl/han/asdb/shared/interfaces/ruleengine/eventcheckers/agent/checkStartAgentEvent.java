package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.agent.StartAgentEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkStartAgentEvent {
    checker c = new checker();

    public void checkAnEvent(StartAgentEvent event) {
        c.checkAgentUuid(event.getAgentUuid());
        c.checkPlayerUuid(event.getPlayerId());
    }
}
