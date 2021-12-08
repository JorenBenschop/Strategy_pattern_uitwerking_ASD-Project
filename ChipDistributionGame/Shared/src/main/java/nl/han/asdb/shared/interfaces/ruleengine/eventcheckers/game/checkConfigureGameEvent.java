package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.ConfigureGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkConfigureGameEvent {
    checker c = new checker();

    public void checkAnEvent(ConfigureGameEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
        c.checkPeerIps(event.getPeerIps());
        c.checkSettings(event.getSettings());
    }
}
