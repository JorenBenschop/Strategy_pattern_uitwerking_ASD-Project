package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.*;

public class LeaveGameEvent {
    private UUID uuid;
    private List<String> peerIPs =new ArrayList<String>();

    public LeaveGameEvent(){}

    public LeaveGameEvent(List<String> peerIPs) {
        this.peerIPs = peerIPs;
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
}
