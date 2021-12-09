package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.connections;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.connections.RegisterConnectionEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkRegisterConnectionEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(RegisterConnectionEvent event) throws EventValueIncompleteException {
        Checker.checkPlayerIp(event.getOwnIp());
        Checker.checkPeerIp(event.getPeerIp());
        Checker.checkPeerUuid(event.getPeerUuid());
    }
}
