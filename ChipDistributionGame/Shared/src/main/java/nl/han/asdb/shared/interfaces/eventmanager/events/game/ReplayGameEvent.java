package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.UUID;

public class ReplayGameEvent {
    private UUID uuid;

    public ReplayGameEvent(){}

    public ReplayGameEvent(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
