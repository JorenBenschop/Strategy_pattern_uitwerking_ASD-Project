package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class LeaveGameEvent extends Event {
    private final UUID uuid;
    private List<String> peerIPs = new ArrayList<String>();

    public LeaveGameEvent(UUID eventUuid, UUID uuid, List<String> peerIPs) {
        super(eventUuid);
        this.uuid = uuid;
        this.peerIPs = peerIPs;
        this.eventType = EventType.JoinGameEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }
}
