package nl.han.asdb.shared.interfaces.eventmanager.events.gamestatistics;

import java.util.UUID;

public class GetGameStatisticsEvent {
    private UUID gameUuid;
    private UUID uuid;

    public GetGameStatisticsEvent(){
    }

    public GetGameStatisticsEvent(UUID gameUuid, UUID uuid) {
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
