package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.StopGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkStopGameEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(StopGameEvent event) throws EventValueIncompleteException {
        Checker.checkGameUuid(event.getGameUuid());
        Checker.checkPeerIps(event.getPeerIPs());
    }
}
