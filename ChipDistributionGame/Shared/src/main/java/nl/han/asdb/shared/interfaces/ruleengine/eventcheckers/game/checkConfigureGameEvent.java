package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.ConfigureGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkConfigureGameEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(ConfigureGameEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getPlayerId());
        Checker.checkPeerIps(event.getPeerIps());
        Checker.checkSettings(event.getSettings());
    }
}
