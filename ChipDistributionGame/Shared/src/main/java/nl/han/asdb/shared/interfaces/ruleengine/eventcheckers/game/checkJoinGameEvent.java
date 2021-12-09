package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.JoinGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkJoinGameEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(JoinGameEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getPlayerId());
        Checker.checkGameUuid(event.getGameUuid());
        checkPeerIps(event.getPeerIPs());
    }
}
