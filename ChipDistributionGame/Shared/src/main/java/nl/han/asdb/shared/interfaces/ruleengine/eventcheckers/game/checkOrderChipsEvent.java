package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.OrderChipsEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkOrderChipsEvent {
    checker c = new checker();

    public void checkAnEvent(OrderChipsEvent event) {
        c.checkSellerUuid(event.getSellerUuid());
        c.checkBuyerUuid(event.getBuyerUuid());
        c.checkOrderAmountValidity(event.getOrderAmount());
        c.checkPricePerItem(event.getPricePerItem());
        c.checkRoundValidity(event.getRound());
    }
}
