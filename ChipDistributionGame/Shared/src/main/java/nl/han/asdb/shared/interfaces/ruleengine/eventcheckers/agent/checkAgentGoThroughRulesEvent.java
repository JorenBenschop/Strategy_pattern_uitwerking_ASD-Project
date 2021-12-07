package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.checkEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkAgentGoThroughRulesEvent implements checkEvent {

    //checker c = new checker();
    @Override
    public boolean checkAnEvent(Event event) {
        //c.checkAgentUuid(agentUUID);
        return false;
    }
}
