package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.StartGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkStartGameEvent {
    checker c = new checker();

    public void checkAnEvent(StartGameEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
        c.checkPlayerIp(event.getIp());
        c.checkPeerIps(event.getPeerIPs());
    }
}