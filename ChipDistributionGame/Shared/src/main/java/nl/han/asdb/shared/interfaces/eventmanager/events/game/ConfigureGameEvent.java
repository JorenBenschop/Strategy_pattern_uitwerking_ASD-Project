package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class ConfigureGameEvent extends Event {
    private UUID uuid;
    private List<String> peerIPs =new ArrayList<String>();
    HashMap<String, String> settings = new HashMap<String, String>();

    public ConfigureGameEvent(){
        this.eventType = EventType.ConfigureGameEvent;
    }

    public ConfigureGameEvent(UUID eventUuid, UUID uuid, List<String> peerIPs, HashMap<String, String> settings) {
        super(eventUuid);
        this.uuid = uuid;
        this.peerIPs = peerIPs;
        this.settings = settings;
        this.eventType = EventType.ConfigureGameEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }

    public HashMap<String, String> getSettings() {
        return settings;
    }

    public void setSettings(HashMap<String, String> settings) {
        this.settings = settings;
    }
}
