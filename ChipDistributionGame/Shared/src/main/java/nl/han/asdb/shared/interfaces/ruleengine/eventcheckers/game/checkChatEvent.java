package nl.han.asdb.shared.interfaces.ruleengine.eventcheckers.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.game.ChatEvent;
import nl.han.asdb.shared.interfaces.ruleengine.checker;

public class checkChatEvent {
    checker c = new checker();

    public void checkAnEvent(ChatEvent event) {
        c.checkRecipientUuid(event.getRecipientUuid());
        c.checkSenderUuid(event.getSenderUuid());
        c.checkValidMessage(event.getChatText());
        c.checkRoundValidity(event.getRound());
        c.checkTimeDate(event.getTime());
    }
}
