package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.StopGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkStopGameEvent {
    checker c = new checker();

    public void checkAnEvent(StopGameEvent event) {
        c.checkGameUuid(event.getGameUuid());
        c.checkPeerIps(event.getPeerIPs());
    }
}
