package nl.han.asdb.eventhandler.events.game;

import java.util.*;

public class LeaveGameEvent {
    private String UUID;
    private List<String> PeerIPs=new ArrayList<String>();

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
        PeerIPs = peerIPs;
    }
}
