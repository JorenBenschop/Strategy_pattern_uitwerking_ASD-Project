package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.gamemaster;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster.GrabCardBasedOnChanceEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkGrabCardBasedOnChanceEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(GrabCardBasedOnChanceEvent event) throws EventValueIncompleteException {
        Checker.checkChanceEventWithinBounds(event.getCalculatedChance());
        Checker.checkRoundValidity(event.getRound());
    }
}
