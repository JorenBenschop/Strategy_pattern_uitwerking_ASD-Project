package nl.han.asdb.shared.interfaces.eventmanager.events;

import java.util.UUID;

public class Event {
    public EventType eventType;
    private UUID eventUuid;

    public Event(){}

    public Event(UUID eventUuid) {
        this.eventUuid = eventUuid;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public UUID getEventUuid() {
        return eventUuid;
    }

    public void setEventUuid(UUID eventUuid) {
        this.eventUuid = eventUuid;
    }
}
