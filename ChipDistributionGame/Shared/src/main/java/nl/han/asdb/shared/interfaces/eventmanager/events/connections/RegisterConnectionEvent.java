package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class RegisterConnectionEvent extends Event {
    private String peerIp;
    private String ownIp;
    private UUID peerUuid;

    public RegisterConnectionEvent(){
        this.eventType = EventType.RegisterConnectionEvent;
    }

    public RegisterConnectionEvent(UUID eventUuid, String peerIp, String ownIp, UUID peerUuid){
        super(eventUuid);
        this.peerIp = peerIp;
        this.ownIp = ownIp;
        this.peerUuid = peerUuid;
        this.eventType = EventType.RegisterConnectionEvent;
    }


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

    public UUID getPeerUuid() {
        return peerUuid;
    }

    public void setPeerUUID(UUID peerUuid) {
        this.peerUuid = peerUuid;
    }
}
