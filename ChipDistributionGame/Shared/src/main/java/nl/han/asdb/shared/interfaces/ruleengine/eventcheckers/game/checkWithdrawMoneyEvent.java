package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.WithdrawMoneyEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkWithdrawMoneyEvent implements IcheckerStrategy {

    @Override
    public void checkAnEvent(WithdrawMoneyEvent event) throws EventValueIncompleteException {
        Checker.checkEntityUuid(event.getEntityId());
        Checker.checkPriceAmountValidity(event.getPriceAmount());
        Checker.checkRoundValidity(event.getRound());
    }
}
