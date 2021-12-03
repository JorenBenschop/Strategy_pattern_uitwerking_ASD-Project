package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class BacklogOrderEvent extends Event {
    private final UUID sellerUuid;
    private final UUID buyerUuid;
    private final short backlogAmount;
    private final short round;

    public BacklogOrderEvent(UUID eventUuid, UUID sellerUuid, UUID buyerUuid, short backlogAmount, short round) {
        super(eventUuid);
        this.sellerUuid = sellerUuid;
        this.buyerUuid = buyerUuid;
        this.backlogAmount = backlogAmount;
        this.round = round;
        this.eventType = EventType.BacklogOrderEvent;
    }

    public UUID getSellerUuid() {
        return sellerUuid;
    }

    public UUID getBuyerUuid() {
        return buyerUuid;
    }

    public short getBacklogAmount() {
        return backlogAmount;
    }

    public short getRound() {
        return round;
    }

}
