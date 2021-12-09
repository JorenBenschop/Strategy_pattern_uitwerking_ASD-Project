package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.OrderChipsEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkOrderChipsEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(OrderChipsEvent event) throws EventValueIncompleteException {
        Checker.checkSellerUuid(event.getSellerUuid());
        Checker.checkBuyerUuid(event.getBuyerUuid());
        Checker.checkOrderAmountValidity(event.getOrderAmount());
        Checker.checkPricePerItem(event.getPricePerItem());
        Checker.checkRoundValidity(event.getRound());
    }
}
