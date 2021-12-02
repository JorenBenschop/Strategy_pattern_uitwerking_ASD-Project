package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class LeaveGameEvent extends Event {
    private UUID uuid;
    private List<String> peerIPs =new ArrayList<String>();

    public LeaveGameEvent(){

        this.eventType = EventType.JoinGameEvent;
    }

    public LeaveGameEvent(UUID eventUuid, List<String> peerIPs) {
        super(eventUuid);
        this.peerIPs = peerIPs;
        this.eventType = EventType.JoinGameEvent;
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
