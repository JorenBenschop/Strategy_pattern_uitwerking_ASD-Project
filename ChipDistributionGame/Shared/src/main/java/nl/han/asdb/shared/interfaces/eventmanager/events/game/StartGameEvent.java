package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class StartGameEvent extends Event {
    private final UUID playerId;
    private final String ip;
    private List<String> peerIPs =new ArrayList<String>();

    public StartGameEvent(UUID eventUuid, UUID playerId, String ip, List<String> peerIPs) {
        super(eventUuid);
        this.playerId = playerId;
        this.ip = ip;
        this.peerIPs = peerIPs;
        this.eventType = EventType.StartGameEvent;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public String getIp() {
        return ip;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }
}
