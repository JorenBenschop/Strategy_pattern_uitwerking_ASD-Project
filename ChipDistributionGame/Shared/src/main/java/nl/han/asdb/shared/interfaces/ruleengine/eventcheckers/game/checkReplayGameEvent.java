package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.ReplayGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkReplayGameEvent {
    checker c = new checker();

    public void checkAnEvent(ReplayGameEvent event) {
        c.checkPlayerUuid(event.getPlayerId());
    }
}
