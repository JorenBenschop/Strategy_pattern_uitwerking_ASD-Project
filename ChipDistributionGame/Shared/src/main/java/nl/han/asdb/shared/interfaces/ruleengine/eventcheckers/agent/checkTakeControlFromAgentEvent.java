package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.agent.TakeControlFromAgentEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkTakeControlFromAgentEvent {
    checker c = new checker();

    public void checkAnEvent(TakeControlFromAgentEvent event) {
        c.checkAgentUuid(event.getAgentUuid());
        c.checkPlayerUuid(event.getPlayerId());
    }
}
