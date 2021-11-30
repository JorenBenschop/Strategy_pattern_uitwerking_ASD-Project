package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class SetupGameEvent extends Event {
    private UUID uuid;
    private String ip;

    public SetupGameEvent(){
        this.eventType = EventType.SetupGameEvent;
    }

    public SetupGameEvent(UUID eventUuid, UUID uuid, String ip) {
        super(eventUuid);
        this.uuid = uuid;
        this.ip = ip;
        this.eventType = EventType.SetupGameEvent;
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
