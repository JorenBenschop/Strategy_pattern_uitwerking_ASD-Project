package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.database;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.database.SychroniseGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkSynchoniseGameEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(SychroniseGameEvent event) throws EventValueIncompleteException {
        Checker.checkPeerIps(event.getPeerIps());
        Checker.checkAgentUuid(event.getAgentUUID());
    }
}
