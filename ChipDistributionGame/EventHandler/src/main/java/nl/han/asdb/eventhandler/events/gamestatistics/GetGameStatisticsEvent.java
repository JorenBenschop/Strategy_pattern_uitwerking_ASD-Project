package nl.han.asdb.eventhandler.events.gamestatistics;

public class GetGameStatisticsEvent {
    private String GameUUID;
    private String UUID;

    public String getGameUUID() {
        return GameUUID;
    }

    public void setGameUUID(String gameUUID) {
        GameUUID = gameUUID;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
