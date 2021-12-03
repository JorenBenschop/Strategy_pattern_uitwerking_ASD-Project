package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class ConfigureGameEvent extends Event {
    private final UUID uuid;
    private List<String> peerIPs =new ArrayList<String>();
    private HashMap<String, String> settings = new HashMap<String, String>();

    public ConfigureGameEvent(UUID eventUuid, UUID uuid, List<String> peerIPs, HashMap<String, String> settings) {
        super(eventUuid);
        this.uuid = uuid;
        this.peerIPs = peerIPs;
        this.settings = settings;
        this.eventType = EventType.ConfigureGameEvent;
    }

    public UUID getUuid() { return uuid; }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public HashMap<String, String> getSettings() {
        return settings;
    }
}
