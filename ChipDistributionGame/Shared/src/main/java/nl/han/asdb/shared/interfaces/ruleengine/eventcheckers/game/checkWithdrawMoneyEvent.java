package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.WithdrawMoneyEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkWithdrawMoneyEvent {

    checker c = new checker();

    public void checkAnEvent(WithdrawMoneyEvent event) {
        c.checkAgentUuid((event.getAgentUuid()));
    }
}
