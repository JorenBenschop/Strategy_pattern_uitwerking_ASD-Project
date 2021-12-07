package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class DisconnectEvent extends Event{
    private final UUID playerId;
    private final String ownIp;

    public DisconnectEvent(UUID eventUuid, UUID playerId, String ownIp){
        super(eventUuid);
        this.playerId = playerId;
        this.ownIp = ownIp;
        this.eventType = EventType.DisconnectEvent;
    }

    public UUID getplayerId() {
        return playerId;
    }

    public String getOwnIp() {
        return ownIp;
    }
}
