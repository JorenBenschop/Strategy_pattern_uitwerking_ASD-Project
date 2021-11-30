package nl.han.asdb.shared.dto;

public class GameDTO {
    private int gameId;
    private int numberOfRounds;
    private Enum gameType;
    private int maxTurnTime;
    private boolean isActive;

    public GameDTO() {
    }

    public GameDTO(int gameId, int numberOfRounds, Enum gameType, int maxTurnTime, boolean isActive) {
        this.gameId = gameId;
        this.numberOfRounds = numberOfRounds;
        this.gameType = gameType;
        this.maxTurnTime = maxTurnTime;
        this.isActive = isActive;
    }
}
