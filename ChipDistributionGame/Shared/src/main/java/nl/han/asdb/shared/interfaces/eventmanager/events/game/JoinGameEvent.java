package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class JoinGameEvent extends Event{
    private final UUID playerId;
    private final UUID GameUuid;
    private List<String> peerIPs;

    public JoinGameEvent(UUID eventUuid, UUID playerId, UUID gameUuid, List<String> peerIPs) {
        super(eventUuid);
        this.playerId = playerId;
        GameUuid = gameUuid;
        this.peerIPs = peerIPs;
        this.eventType = EventType.JoinGameEvent;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public UUID getGameUuid() {
        return GameUuid;
    }
}
