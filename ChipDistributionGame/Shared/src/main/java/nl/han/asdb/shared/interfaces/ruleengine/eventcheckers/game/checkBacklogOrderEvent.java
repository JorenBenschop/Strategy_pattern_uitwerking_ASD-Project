package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.BacklogOrderEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkBacklogOrderEvent {
    checker c = new checker();

    public void checkAnEvent(BacklogOrderEvent event) {
        c.checkSellerUuid(event.getSellerUuid());
        c.checkBuyerUuid(event.getBuyerUuid());
        c.checkBacklogValidity(event.getBacklogAmount());
        c.checkRoundValidity(event.getRound());
    }
}
