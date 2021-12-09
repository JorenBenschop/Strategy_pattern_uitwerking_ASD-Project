package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.gamemaster;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster.SaveCardForReplayEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkSaveCardForReplayEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(SaveCardForReplayEvent event) throws EventValueIncompleteException {
        Checker.checkCardExists(event.getCard());
        Checker.checkRoundValidity(event.getRound());
    }
}
