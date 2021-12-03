package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class DeliveryEvent extends Event {
    private final UUID entityId;
    private final short amount;

    public DeliveryEvent(UUID eventUuid, UUID entityId, short amount) {
        super(eventUuid);
        this.entityId = entityId;
        this.amount = amount;
        this.eventType = EventType.DeliveryEvent;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public int getAmount() {
        return amount;
    }
}
