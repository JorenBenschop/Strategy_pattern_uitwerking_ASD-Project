package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.agent.ConfigureAgentEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkConfigureAgentEvent {

    checker c = new checker();

    public void checkAnEvent(ConfigureAgentEvent event) {
        c.checkAgentUuid(event.getAgentUuid());
        c.checkAgentCode(event.getAgentCode());
    }
}
