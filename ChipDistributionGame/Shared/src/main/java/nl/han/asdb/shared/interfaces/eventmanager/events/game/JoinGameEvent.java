package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class JoinGameEvent extends Event{
    private final UUID uuid;
    private final UUID GameUuid;
    private List<String> peerIPs = new ArrayList<String>();

    public JoinGameEvent(UUID eventUuid, UUID uuid, UUID gameUuid, List<String> peerIPs) {
        super(eventUuid);
        this.uuid = uuid;
        GameUuid = gameUuid;
        this.peerIPs = peerIPs;
        this.eventType = EventType.JoinGameEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public UUID getGameUuid() {
        return GameUuid;
    }
}
