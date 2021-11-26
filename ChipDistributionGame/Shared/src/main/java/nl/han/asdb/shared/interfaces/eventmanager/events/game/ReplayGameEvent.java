package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class ReplayGameEvent extends Event {
    private UUID uuid;

    public ReplayGameEvent(){}

    public ReplayGameEvent(UUID eventUuid, UUID uuid) {
        super(eventUuid);
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
