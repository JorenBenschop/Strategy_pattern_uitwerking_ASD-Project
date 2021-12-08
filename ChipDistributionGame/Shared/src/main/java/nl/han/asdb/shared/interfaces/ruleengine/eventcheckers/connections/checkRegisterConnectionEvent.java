package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.connections.RegisterConnectionEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkRegisterConnectionEvent {
    checker c = new checker();

    public void checkAnEvent(RegisterConnectionEvent event) {
        c.checkPlayerIp(event.getAgentUuid());
        c.checkPeerIp(event.getPlayerId());
        c.checkPeerUuid(event.getPeerUuid());
    }
}
