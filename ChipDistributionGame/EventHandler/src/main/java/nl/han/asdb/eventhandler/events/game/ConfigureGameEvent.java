package nl.han.asdb.eventhandler.events.game;

import nl.han.asdb.eventhandler.events.Event;

import java.util.*;

public class ConfigureGameEvent extends Event {
    private String UUID;
    private List<String> PeerIPs=new ArrayList<String>();
    HashMap<String, String> Settings = new HashMap<String, String>();

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public List<String> getPeerIPs() {
        return PeerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.PeerIPs = peerIPs;
    }

    public HashMap<String, String> getSettings() {
        return Settings;
    }

    public void setSettings(HashMap<String, String> settings) {
        this.Settings = settings;
    }
}
