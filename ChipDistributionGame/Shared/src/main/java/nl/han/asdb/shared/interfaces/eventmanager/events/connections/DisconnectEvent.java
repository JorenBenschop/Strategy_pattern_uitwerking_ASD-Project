package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class DisconnectEvent extends Event{
    private UUID uuid;
    private String ip;

    public DisconnectEvent(){
        this.eventType = EventType.DisconnectEvent;
    }

    public DisconnectEvent(UUID eventUuid, UUID uuid, String ip){
        super(eventUuid);
        this.uuid = uuid;
        this.eventType = EventType.DisconnectEvent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
