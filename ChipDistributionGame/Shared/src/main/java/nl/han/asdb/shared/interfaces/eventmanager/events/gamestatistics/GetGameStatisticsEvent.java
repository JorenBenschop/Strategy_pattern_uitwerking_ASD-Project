package nl.han.asdb.shared.interfaces.eventmanager.events.gamestatistics;

public class GetGameStatisticsEvent {
    private String gameUuid;
    private String uuid;

    public String getGameUuid() {
        return gameUuid;
    }

    public void setGameUuid(String gameUuid) {
        this.gameUuid = gameUuid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
