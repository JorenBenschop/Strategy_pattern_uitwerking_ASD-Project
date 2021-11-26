package nl.han.asdb.shared.interfaces.eventmanager.events.connections;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class DisconnectEvent extends Event{
    private String uuid;
    private String ip;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
