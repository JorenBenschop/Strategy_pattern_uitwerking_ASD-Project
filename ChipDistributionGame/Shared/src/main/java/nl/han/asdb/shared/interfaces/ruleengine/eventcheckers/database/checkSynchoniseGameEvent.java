package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.database;

import nl.han.asdb.shared.interfaces.eventmanager.events.database.SychroniseGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkSynchoniseGameEvent {

    checker c = new checker();

    public void checkAnEvent(SynchroniseGameEvent event) {
        c.checkPeerIp(event.getPlayerId());
        c.checkPeerUuid(event.getAgentUuid());
    }
}
