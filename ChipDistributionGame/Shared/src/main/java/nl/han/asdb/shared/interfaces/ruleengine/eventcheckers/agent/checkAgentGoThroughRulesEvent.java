package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkAgentGoThroughRulesEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(Event event) throws EventValueIncompleteException {
        Checker.checkAgentUuid(event.getAgentUuid());
        Checker.checkPlayerUuid(event.getPlayerId());
        Checker.checkAgentRules(event.getRules());
    }
}
