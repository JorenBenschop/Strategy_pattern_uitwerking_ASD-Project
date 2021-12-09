package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.SellChipsEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkSellChipsEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(SellChipsEvent event) throws EventValueIncompleteException {
        Checker.checkSellerUuid(event.getSellerUuid());
        Checker.checkBuyerUuid(event.getBuyerUuid());
        Checker.checkOrderAmountValidity(event.getOrderAmount());
        Checker.checkPricePerItem(event.getPricePerItem());
        Checker.checkRoundValidity(event.getRound());
    }
}
