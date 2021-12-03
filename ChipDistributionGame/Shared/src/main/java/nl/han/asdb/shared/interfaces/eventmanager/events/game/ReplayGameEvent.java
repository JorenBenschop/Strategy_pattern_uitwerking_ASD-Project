package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class ReplayGameEvent extends Event {
    private final UUID uuid;

    public ReplayGameEvent(UUID eventUuid, UUID uuid) {
        super(eventUuid);
        this.uuid = uuid;
        this.eventType = EventType.ReplayGameEvent;
    }

    public UUID getUuid() {
        return uuid;
    }
}
