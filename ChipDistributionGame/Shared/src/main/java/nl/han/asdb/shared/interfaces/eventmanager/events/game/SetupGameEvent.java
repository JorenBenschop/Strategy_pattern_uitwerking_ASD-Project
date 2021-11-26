package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.UUID;

public class SetupGameEvent {
    private UUID uuid;
    private String ip;

    public SetupGameEvent(){}

    public SetupGameEvent(UUID uuid, String ip) {
        this.uuid = uuid;
        this.ip = ip;
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
