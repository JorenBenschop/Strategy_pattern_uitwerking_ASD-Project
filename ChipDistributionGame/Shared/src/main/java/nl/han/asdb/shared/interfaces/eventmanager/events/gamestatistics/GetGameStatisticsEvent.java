package nl.han.asdb.shared.interfaces.eventmanager.events.gamestatistics;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import java.util.UUID;

public class GetGameStatisticsEvent extends Event{
    private UUID gameUuid;
    private UUID uuid;

    public GetGameStatisticsEvent(){
    }

    public GetGameStatisticsEvent(UUID eventUuid, UUID gameUuid, UUID uuid) {
        super(eventUuid);
        this.gameUuid = gameUuid;
        this.uuid = uuid;
    }

    public UUID getGameUuid() {
        return gameUuid;
    }

    public void setGameUuid(UUID gameUuid) {
        this.gameUuid = gameUuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
