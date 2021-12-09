package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkDisconnectEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(Event event) throws EventValueIncompleteException {
        Checker.checkPlayerUuid(event.getplayerId());
        Checker.checkPlayerIp(event.getOwnIp());
    }
}
