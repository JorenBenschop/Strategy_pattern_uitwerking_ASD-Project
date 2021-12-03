package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.time.LocalDateTime;
import java.util.*;

public class ChatEvent extends Event {
    private final UUID recipientUuid;
    private final UUID senderUuid;
    private final String chatText;
    private final short round;
    private final LocalDateTime time;

    public ChatEvent(UUID eventUuid, UUID recipientUuid, UUID senderUuid, String chatText, short round, LocalDateTime time) {
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

    public UUID getSenderUuid() {
        return senderUuid;
    }

    public String getChatText() {
        return chatText;
    }

    public short getRound() {
        return round;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
