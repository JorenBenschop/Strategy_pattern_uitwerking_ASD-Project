package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import java.util.*;

public class ChatEvent extends Event {
    private String recipientUuid;
    private String senderUuid;
    private String chatText;
    private short round;
    Date tijd = new Date();

    public String getRecipientUuid() {
        return recipientUuid;
    }

    public void setRecipientUuid(String recipientUuid) {
        this.recipientUuid = recipientUuid;
    }

    public String getSenderUuid() {
        return senderUuid;
    }

    public void setSenderUuid(String senderUuid) {
        this.senderUuid = senderUuid;
    }

    public String getChatText() {
        return chatText;
    }

    public void setChatText(String chatText) {
        this.chatText = chatText;
    }

    public short getRound() {
        return round;
    }

    public void setRound(short round) {
        this.round = round;
    }

    public Date getTijd() {
        return tijd;
    }

    public void setTijd(Date tijd) {
        this.tijd = tijd;
    }
}
