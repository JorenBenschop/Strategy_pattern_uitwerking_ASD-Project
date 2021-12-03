package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class DisconnectEvent extends Event{
    private final UUID uuid;
    private final String ip;

    public DisconnectEvent(UUID eventUuid, UUID uuid, String ip){
        super(eventUuid);
        this.uuid = uuid;
        this.ip = ip;
        this.eventType = EventType.DisconnectEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getIp() {
        return ip;
    }
}
