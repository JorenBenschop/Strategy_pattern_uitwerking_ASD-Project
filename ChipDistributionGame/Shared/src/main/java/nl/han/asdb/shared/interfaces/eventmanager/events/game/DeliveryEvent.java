package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class DeliveryEvent extends Event {
    private final UUID entityId;
    private final short orderAmount;

    public DeliveryEvent(UUID eventUuid, UUID entityId, short orderAmount) {
        super(eventUuid);
        this.entityId = entityId;
        this.orderAmount = orderAmount;
        this.eventType = EventType.DeliveryEvent;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public short getOrderAmount() {
        return orderAmount;
    }
}
