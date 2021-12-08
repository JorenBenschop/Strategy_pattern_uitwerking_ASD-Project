package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class ReplayGameEvent extends Event {
    private final UUID playerId;

    public ReplayGameEvent(UUID eventUuid, UUID playerId) {
        super(eventUuid);
        this.playerId = playerId;
        this.eventType = EventType.ReplayGameEvent;
    }

    public UUID getPlayerId() {
        return playerId;
    }
}
