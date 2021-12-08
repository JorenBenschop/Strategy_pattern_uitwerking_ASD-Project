package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.connections.SearchForGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkSearchForGameEvent {
    checker c = new checker();

    public void checkAnEvent(SearchForGameEvent event) {
        c.checkPlayerIp(event.getAgentUuid());
        c.checkPeerIp(event.getPlayerId());
        c.checkPeerUuid(event.getPeerUuid());
    }
}
