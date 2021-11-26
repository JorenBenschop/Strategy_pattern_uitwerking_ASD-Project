package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.*;

public class StartGameEvent {
    private UUID uuid;
    private String ip;
    private List<String> peerIPs =new ArrayList<String>();

    public StartGameEvent(){}

    public StartGameEvent(UUID uuid, String ip, List<String> peerIPs) {
        this.uuid = uuid;
        this.ip = ip;
        this.peerIPs = peerIPs;
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
