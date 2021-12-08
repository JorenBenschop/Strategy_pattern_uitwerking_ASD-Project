package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.SetupGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkSetupGameEvent {
    checker c = new checker();

    public void checkAnEvent(SetupGameEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
        c.checkPlayerIp(event.getIp());
    }
}
