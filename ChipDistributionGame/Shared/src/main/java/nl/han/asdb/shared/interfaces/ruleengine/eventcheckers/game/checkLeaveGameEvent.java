package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.LeaveGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkLeaveGameEvent {
    checker c = new checker();

    public void checkAnEvent(LeaveGameEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
        c.checkPeerIps(event.getPeerIPs());
    }
}
