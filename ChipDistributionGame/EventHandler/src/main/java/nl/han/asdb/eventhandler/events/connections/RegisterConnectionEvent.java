package nl.han.asdb.eventhandler.events.connections;

import nl.han.asdb.eventhandler.events.Event;

public class RegisterConnectionEvent extends Event {
    private String PeerIP;
    private String OwnIP;
    private String PeerUUID;

    public String getPeerIP() {
        return PeerIP;
    }

    public void setPeerIP(String peerIP) {
        PeerIP = peerIP;
    }

    public String getOwnIP() {
        return OwnIP;
    }

    public void setOwnIP(String ownIP) {
        OwnIP = ownIP;
    }

    public String getPeerUUID() {
        return PeerUUID;
    }

    public void setPeerUUID(String peerUUID) {
        PeerUUID = peerUUID;
    }
}
