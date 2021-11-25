package nl.han.asdb.eventhandler.events.game;

import nl.han.asdb.eventhandler.events.Event;
import java.util.*;

public class ChatEvent extends Event {
    private String RecipientUUID;
    private String SenderUUID;
    private String ChatText;
    private short Round;
    Date tijd = new Date();

    public String getRecipientUUID() {
        return RecipientUUID;
    }

    public void setRecipientUUID(String recipientUUID) {
        this.RecipientUUID = recipientUUID;
    }

    public String getSenderUUID() {
        return SenderUUID;
    }

    public void setSenderUUID(String senderUUID) {
        this.SenderUUID = senderUUID;
    }

    public String getChatText() {
        return ChatText;
    }

    public void setChatText(String chatText) {
        this.ChatText = chatText;
    }

    public short getRound() {
        return Round;
    }

    public void setRound(short round) {
        this.Round = round;
    }

    public Date getTijd() {
        return tijd;
    }

    public void setTijd(Date tijd) {
        this.tijd = tijd;
    }
}
