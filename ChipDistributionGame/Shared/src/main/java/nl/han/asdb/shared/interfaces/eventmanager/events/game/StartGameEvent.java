package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class StartGameEvent extends Event {
    private UUID uuid;
    private String ip;
    private List<String> peerIPs =new ArrayList<String>();

    public StartGameEvent(){
        this.eventType = EventType.StartGameEvent;}

    public StartGameEvent(UUID eventUuid, UUID uuid, String ip, List<String> peerIPs) {
        super(eventUuid);
        this.uuid = uuid;
        this.ip = ip;
        this.peerIPs = peerIPs;
        this.eventType = EventType.StartGameEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }
}
