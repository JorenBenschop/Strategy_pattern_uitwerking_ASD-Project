package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.JoinGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkJoinGameEvent {
    checker c = new checker();

    public void checkAnEvent(JoinGameEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
        c.checkGameUuid(event.getGameUuid());
        c.checkPeerIps(event.getPeerIPs());
    }
}
