package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.*;

public class LeaveGameEvent {
    private String uuid;
    private List<String> peerIPs =new ArrayList<String>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }
}
