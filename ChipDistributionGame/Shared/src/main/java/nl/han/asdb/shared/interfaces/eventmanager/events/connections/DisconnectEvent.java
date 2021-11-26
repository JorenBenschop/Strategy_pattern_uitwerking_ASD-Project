package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class DisconnectEvent extends Event{
    private UUID uuid;
    private String ip;

    public DisconnectEvent(){
    }

    public DisconnectEvent(UUID eventUuid, UUID uuid, String ip){
        super(eventUuid);
        this.uuid = uuid;
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
