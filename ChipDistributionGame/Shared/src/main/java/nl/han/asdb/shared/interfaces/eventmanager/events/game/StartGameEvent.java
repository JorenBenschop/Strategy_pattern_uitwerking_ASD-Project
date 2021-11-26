package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.*;

public class StartGameEvent {
    private String uuid;
    private String ip;
    private List<String> peerIPs =new ArrayList<String>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
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
