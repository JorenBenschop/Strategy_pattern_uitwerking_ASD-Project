package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.SellChipsEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkSellChipsEvent {
    checker c = new checker();

    public void checkAnEvent(SellChipsEvent event) {
        c.checkSellerUuid(event.getSellerUuid());
        c.checkBuyerUuid(event.getBuyerUuid());
        c.checkOrderAmountValidity(event.getOrderAmount());
        c.checkPricePerItem(event.getPricePerItem());
        c.checkRoundValidity(event.getRound());
    }
}
