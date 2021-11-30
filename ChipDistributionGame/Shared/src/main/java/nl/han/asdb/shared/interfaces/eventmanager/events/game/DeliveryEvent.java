package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class DeliveryEvent extends Event {
    UUID entityId;
    int amount;

    public DeliveryEvent(UUID eventId, UUID entityId, int amount) {
        super(eventId);
        this.entityId = entityId;
        this.amount = amount;
        this.eventType = EventType.DeliveryEvent;
    }
    public DeliveryEvent() {
        this.eventType = EventType.DeliveryEvent;
    }

    public UUID getEntityId() {
        return entityId;
    }

    public void setEntityId(UUID entityId) {
        this.entityId = entityId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
