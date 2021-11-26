package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class SearchForGameEvent extends Event {
    private String peerIp;
    private String ownIp;
    private UUID peerUuid;

    public SearchForGameEvent(){
    }

    public SearchForGameEvent(String peerIp, String ownIp, UUID peerUuid) {
        this.peerIp = peerIp;
        this.ownIp = ownIp;
        this.peerUuid = peerUuid;
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
