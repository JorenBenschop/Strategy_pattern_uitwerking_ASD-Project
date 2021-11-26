package nl.han.asdb.shared.interfaces.eventmanager.events.gamestatistics;

public class GetGameStatisticsEvent {
    private String GameUUID;
    private String UUID;

    public String getGameUUID() {
        return GameUUID;
    }

    public void setGameUUID(String gameUUID) {
        this.GameUUID = gameUUID;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }
}
