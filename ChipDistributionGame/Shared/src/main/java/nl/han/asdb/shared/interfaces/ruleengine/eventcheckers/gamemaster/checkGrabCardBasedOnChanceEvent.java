package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.gamemaster;

import nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster.GrabCardBasedOnChanceEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkGrabCardBasedOnChanceEvent {
    checker c = new checker();

    public void checkAnEvent(GrabCardBasedOnChanceEvent event) {
        c.checkChanceEventWithinBounds(event.getCalculatedChance());
        c.checkRoundValidity(event.getRound());
    }
}
