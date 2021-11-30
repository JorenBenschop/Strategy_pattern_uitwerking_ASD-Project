package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class ChatEvent extends Event {
    private UUID recipientUuid;
    private UUID senderUuid;
    private String chatText;
    private short round;
    Date time = new Date();

    public ChatEvent(){
        this.eventType = EventType.ChatEvent;
    }

    public ChatEvent(UUID eventUuid, UUID recipientUuid, UUID senderUuid, String chatText, short round, Date time) {
        super(eventUuid);
        this.recipientUuid = recipientUuid;
        this.senderUuid = senderUuid;
        this.chatText = chatText;
        this.round = round;
        this.time = time;
        this.eventType = EventType.ChatEvent;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
