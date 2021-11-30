package nl.han.asdb.shared.dto.database.game;

import nl.han.asdb.shared.dto.database.round.RoundDTO;

import java.util.List;

public class GameDTO {
    private int gameId;
    private int numberOfRounds;
    private GameType gameType;
    private int maxTurnTime;
    private boolean isActive;
    private List<RoundDTO> rounds;

    public GameDTO() {
    }

    public GameDTO(int gameId, int numberOfRounds, GameType gameType, int maxTurnTime, boolean isActive, List<RoundDTO> rounds) {
        this.gameId = gameId;
        this.numberOfRounds = numberOfRounds;
        this.gameType = gameType;
        this.maxTurnTime = maxTurnTime;
        this.isActive = isActive;
        this.rounds = rounds;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public int getMaxTurnTime() {
        return maxTurnTime;
    }

    public void setMaxTurnTime(int maxTurnTime) {
        this.maxTurnTime = maxTurnTime;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<RoundDTO> getRounds() {
        return rounds;
    }

    public void setRounds(List<RoundDTO> rounds) {
        this.rounds = rounds;
    }
}
