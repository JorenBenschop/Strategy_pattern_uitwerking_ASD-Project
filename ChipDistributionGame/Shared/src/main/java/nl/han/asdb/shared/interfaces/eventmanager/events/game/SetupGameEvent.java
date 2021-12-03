package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class SetupGameEvent extends Event {
    private final UUID uuid;
    private final String ip;

    public SetupGameEvent(UUID eventUuid, UUID uuid, String ip) {
        super(eventUuid);
        this.uuid = uuid;
        this.ip = ip;
        this.eventType = EventType.SetupGameEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getIp() {
        return ip;
    }
}
