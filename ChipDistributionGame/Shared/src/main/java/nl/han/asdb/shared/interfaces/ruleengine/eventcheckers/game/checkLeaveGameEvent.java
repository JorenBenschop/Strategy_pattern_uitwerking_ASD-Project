package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.LeaveGameEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkLeaveGameEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(LeaveGameEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getPlayerId());
        Checker.checkPeerIps(event.getPeerIPs());
    }
}
