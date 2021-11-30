package nl.han.asdb.shared.interfaces.eventmanager.events.game;


import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class StopGameEvent extends Event {
    private UUID gameUuid;
    private List<String> peerIPs=new ArrayList<String>();

    public StopGameEvent(){
        this.eventType = EventType.StopGameEvent;
    }

    public StopGameEvent(UUID eventUuid, UUID gameUuid, List<String> peerIPs) {
        super(eventUuid);
        this.gameUuid = gameUuid;
        this.peerIPs = peerIPs;
        this.eventType = EventType.StopGameEvent;
    }

    public UUID getGameUuid() {
        return gameUuid;
    }

    public void setGameUuid(UUID gameUuid) {
        this.gameUuid = gameUuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }
}
