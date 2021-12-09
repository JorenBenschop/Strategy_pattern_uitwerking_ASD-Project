package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.ruleengine.EventValueIncompleteException;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.ChatEvent;
import nl.han.asdb.shared.interfaces.ruleengine.IcheckerStrategy;

public class checkChatEvent implements IcheckerStrategy{

    @Override
    public void checkAnEvent(ChatEvent event) throws EventValueIncompleteException {
        Checker.checkRecipientUuid(event.getRecipientUuid());
        Checker.checkSenderUuid(event.getSenderUuid());
        Checker.checkValidMessage(event.getChatText());
        Checker.checkRoundValidity(event.getRound());
        Checker.checkTimeDate(event.getTime());
    }
}
