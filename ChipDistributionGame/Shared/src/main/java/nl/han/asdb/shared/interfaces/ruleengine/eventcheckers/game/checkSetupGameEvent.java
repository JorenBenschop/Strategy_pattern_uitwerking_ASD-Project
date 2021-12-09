package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.SetupGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkSetupGameEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(SetupGameEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getPlayerId());
        Checker.checkPlayerIp(event.getIp());
    }
}
