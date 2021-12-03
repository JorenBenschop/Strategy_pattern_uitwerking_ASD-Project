package nl.han.asdb.shared.interfaces.eventmanager.events;

import java.util.*;

public class Event {
    public EventType eventType;
    private UUID eventUuid;

    public Event(UUID eventUuid) {
        this.eventUuid = eventUuid;
    }

    public EventType getEventType() {
        return eventType;
    }

    public UUID getEventUuid() {
        return eventUuid;
    }
}
