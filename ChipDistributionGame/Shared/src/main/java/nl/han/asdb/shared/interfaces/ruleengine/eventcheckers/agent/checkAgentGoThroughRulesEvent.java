package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.ruleengine.checker;
import nl.han.asdb.shared.interfaces.eventmanager.events.agent.AgentGoThroughRulesEvent;

public class checkAgentGoThroughRulesEvent {
    checker c = new checker();

    public void checkAnEvent(AgentGoThroughRulesEvent event) {
        c.checkAgentUuid(event.getAgentUuid());
        c.checkPlayerUuid(event.getPlayerId());
        c.checkRules(event.getRules());
    }
}
