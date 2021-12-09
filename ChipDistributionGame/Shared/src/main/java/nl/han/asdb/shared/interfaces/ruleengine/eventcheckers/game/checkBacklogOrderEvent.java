package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.BacklogOrderEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkBacklogOrderEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(BacklogOrderEvent event) throws EventValueIncompleteException {
        Checker.checkSellerUuid(event.getSellerUuid());
        Checker.checkBuyerUuid(event.getBuyerUuid());
        Checker.checkBacklogValidity(event.getBacklogAmount());
        Checker.checkRoundValidity(event.getRound());
    }
}
