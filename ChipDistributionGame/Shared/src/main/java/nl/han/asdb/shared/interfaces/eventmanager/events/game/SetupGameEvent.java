package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class SetupGameEvent extends Event {
    private final UUID playerId;
    private final String ip;

    public SetupGameEvent(UUID eventUuid, UUID playerId, String ip) {
        super(eventUuid);
        this.playerId = playerId;
        this.ip = ip;
        this.eventType = EventType.SetupGameEvent;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public String getIp() {
        return ip;
    }
}
