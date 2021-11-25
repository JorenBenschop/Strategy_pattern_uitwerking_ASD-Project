package nl.han.asdb.eventhandler.events.connections;

import nl.han.asdb.eventhandler.events.Event;

public class RegisterConnectionEvent extends Event {
    private String peerIp;
    private String ownIp;
    private String peerUuid;

    public String getPeerIP() {
        return peerIp;
    }

    public void setPeerIP(String peerIP) {
        this.peerIp = peerIp;
    }

    public String getOwnIp() {
        return ownIp;
    }

    public void setOwnIp(String ownIp) {
        this.ownIp = ownIp;
    }

    public String getPeerUuid() {
        return peerUuid;
    }

    public void setPeerUUID(String peerUuid) {
        this.peerUuid = peerUuid;
    }
}
