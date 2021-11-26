package nl.han.asdb.shared.dto.database;

import java.time.LocalDate;
import java.util.ArrayList;

public class GameDTO {
    private int gameId;
    private LocalDate endTime;
    private ArrayList<RoundDTO> rounds;
    private String gameType;
    private int numberOfRounds;
    private int turnTime;
    private PlayerDTO players;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }

    public ArrayList<RoundDTO> getRounds() {
        return rounds;
    }

    public void setRounds(ArrayList<RoundDTO> rounds) {
        this.rounds = rounds;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    public void setNumberOfRounds(int numberOfRounds) {
        this.numberOfRounds = numberOfRounds;
    }

    public int getTurnTime() {
        return turnTime;
    }

    public void setTurnTime(int turnTime) {
        this.turnTime = turnTime;
    }

    public PlayerDTO getPlayers() {
        return players;
    }

    public void setPlayers(PlayerDTO players) {
        this.players = players;
    }
}
