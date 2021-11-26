package nl.han.asdb.shared.interfaces.eventmanager.events;

import java.util.UUID;

public class Event {
    private UUID eventUuid;

    public Event(){}

    public Event(UUID eventUuid) {
        this.eventUuid = eventUuid;
    }

    public UUID getEventUuid() {
        return eventUuid;
    }

    public void setEventUuid(UUID eventUuid) {
        this.eventUuid = eventUuid;
    }
}
