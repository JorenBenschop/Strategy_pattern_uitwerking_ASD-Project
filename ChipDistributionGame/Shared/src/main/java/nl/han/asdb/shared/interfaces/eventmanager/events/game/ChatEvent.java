package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import java.util.*;

public class ChatEvent extends Event {
    private UUID recipientUuid;
    private UUID senderUuid;
    private String chatText;
    private short round;
    Date tijd = new Date();

    public ChatEvent(){
    }

    public ChatEvent(UUID recipientUuid, UUID senderUuid, String chatText, short round, Date tijd) {
        this.recipientUuid = recipientUuid;
        this.senderUuid = senderUuid;
        this.chatText = chatText;
        this.round = round;
        this.tijd = tijd;
    }

    public UUID getRecipientUuid() {
        return recipientUuid;
    }

    public void setRecipientUuid(UUID recipientUuid) {
        this.recipientUuid = recipientUuid;
    }

    public UUID getSenderUuid() {
        return senderUuid;
    }

    public void setSenderUuid(UUID senderUuid) {
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
