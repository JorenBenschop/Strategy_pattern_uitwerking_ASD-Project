package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class SearchForGameEvent extends Event {
    private String peerIp;
    private String ownIp;
    private UUID peerUuid;

    public SearchForGameEvent(){
        this.eventType = EventType.SearchForGameEvent;
    }

    public SearchForGameEvent(UUID eventUuid, String peerIp, String ownIp, UUID peerUuid) {
        super(eventUuid);
        this.peerIp = peerIp;
        this.ownIp = ownIp;
        this.peerUuid = peerUuid;
        this.eventType = EventType.SearchForGameEvent;
    }

    public String getPeerIp() {
        return peerIp;
    }

    public void setPeerIp(String peerIp) {
        this.peerIp = peerIp;
    }

    public String getOwnIP() {
        return ownIp;
    }

    public void setOwnIP(String ownIP) {
        this.ownIp = ownIP;
    }

    public UUID getPeerUUID() {
        return peerUuid;
    }

    public void setPeerUUID(UUID peerUUID) {
        this.peerUuid = peerUUID;
    }
}
