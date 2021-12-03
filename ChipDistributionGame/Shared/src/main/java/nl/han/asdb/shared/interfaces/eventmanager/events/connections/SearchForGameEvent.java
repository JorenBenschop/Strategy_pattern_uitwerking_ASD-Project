package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class SearchForGameEvent extends Event {
    private final String peerIp;
    private final String ownIp;
    private final UUID peerUuid;

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

    public String getOwnIP() {
        return ownIp;
    }

    public UUID getPeerUUID() {
        return peerUuid;
    }
}
