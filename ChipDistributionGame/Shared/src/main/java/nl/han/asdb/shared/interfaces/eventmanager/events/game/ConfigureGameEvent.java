package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.*;

public class ConfigureGameEvent extends Event {
    private UUID uuid;
    private List<String> peerIPs =new ArrayList<String>();
    HashMap<String, String> settings = new HashMap<String, String>();

    public ConfigureGameEvent(){
    }

    public ConfigureGameEvent(UUID uuid, List<String> peerIPs, HashMap<String, String> settings) {
        this.uuid = uuid;
        this.peerIPs = peerIPs;
        this.settings = settings;
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
