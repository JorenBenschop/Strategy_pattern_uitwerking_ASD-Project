package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.ReplayGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkReplayGameEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(ReplayGameEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getPlayerId());
    }
}
