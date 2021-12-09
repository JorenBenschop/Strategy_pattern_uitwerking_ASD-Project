package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.StartGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkStartGameEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(StartGameEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getPlayerId());
        Checker.checkPlayerIp(event.getIp());
        Checker.checkPeerIps(event.getPeerIPs());
    }
}