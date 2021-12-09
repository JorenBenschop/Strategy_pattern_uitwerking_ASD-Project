package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class LeaveGameEvent extends Event {
    private final UUID playerId;
    private List<String> peerIPs;

    public LeaveGameEvent(UUID eventUuid, UUID playerId, List<String> peerIPs) {
        super(eventUuid);
        this.playerId = playerId;
        this.peerIPs = peerIPs;
        this.eventType = EventType.LeaveGameEvent;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }
}
