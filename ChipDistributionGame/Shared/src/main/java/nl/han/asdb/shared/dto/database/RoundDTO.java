package nl.han.asdb.shared.dto.database;

import java.util.ArrayList;

public class RoundDTO {
    private int gameId;
    private int roundNumber;
    private ArrayList<TurnDTO> turns;

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public ArrayList<TurnDTO> getTurns() {
        return turns;
    }

    public void setTurns(ArrayList<TurnDTO> turns) {
        this.turns = turns;
    }
}
