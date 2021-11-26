package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class SearchForGameEvent extends Event {
    private String peerIp;
    private String ownIp;
    private String peerUuid;

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

    public String getPeerUUID() {
        return peerUuid;
    }

    public void setPeerUUID(String peerUUID) {
        this.peerUuid = peerUUID;
    }
}
