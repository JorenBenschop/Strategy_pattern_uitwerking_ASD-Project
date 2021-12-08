package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.agent.AgentTakesControlEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkAgentTakesControlEvent  {

    checker c = new checker();

    public void checkAnEvent(AgentTakesControlEvent event) {
        c.checkAgentUuid(event.getAgentUuid());
        c.checkPlayerUuid(event.getPlayerUuid());
    }

}
