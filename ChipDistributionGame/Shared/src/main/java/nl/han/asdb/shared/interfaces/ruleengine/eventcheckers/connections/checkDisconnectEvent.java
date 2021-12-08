package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.connections.DisconnectEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;


public class checkDisconnectEvent {
    checker c = new checker();

    public void checkAnEvent(DisconnectEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
        c.checkPlayerIp(event.getPlayerIp());
    }
