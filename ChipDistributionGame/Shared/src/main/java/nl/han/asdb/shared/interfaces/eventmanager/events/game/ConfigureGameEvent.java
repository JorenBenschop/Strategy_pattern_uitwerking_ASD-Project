package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class ConfigureGameEvent extends Event {
    private final UUID playerId;
    private List<String> peerIps;
    private HashMap<String, String> settings;

    public ConfigureGameEvent(UUID eventUuid, UUID playerId, List<String> peerIps, HashMap<String, String> settings) {
        super(eventUuid);
        this.playerId = playerId;
        this.peerIps = peerIps;
        this.settings = settings;
        this.eventType = EventType.ConfigureGameEvent;
    }

    public UUID getPlayerId() { return playerId; }

    public List<String> getPeerIps() {
        return peerIps;
    }

    public HashMap<String, String> getSettings() {
        return settings;
    }
}
