package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.*;

public class LeaveGameEvent extends Event {
    private UUID uuid;
    private List<String> peerIPs =new ArrayList<String>();

    public LeaveGameEvent(){}

    public LeaveGameEvent(UUID eventUuid, List<String> peerIPs) {
        super(eventUuid);
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
