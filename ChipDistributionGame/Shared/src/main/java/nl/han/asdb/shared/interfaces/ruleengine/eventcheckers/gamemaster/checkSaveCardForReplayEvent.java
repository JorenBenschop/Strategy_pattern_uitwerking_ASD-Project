package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.gamemaster;

import nl.han.asdb.shared.interfaces.eventmanager.events.gamemaster.SaveCardForReplayEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkSaveCardForReplayEvent {
    checker c = new checker();

    public void checkAnEvent(SaveCardForReplayEvent event) {
        c.checkCardExists(event.getCard());
        c.checkRoundValidity(event.getRound());
    }
}
