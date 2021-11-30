package nl.han.asdb.shared.dto.gameservice;

import nl.han.asdb.shared.dto.gameservice.turn.TurnDTO;

import java.util.List;
import java.util.UUID;

public class GameDTO {
    private UUID gameID;
    private List<TurnDTO> turns;
    private boolean isActive;

    public GameDTO(){

    }

    public GameDTO(UUID gameID, List<TurnDTO> turns, boolean isActive){
        this.gameID = gameID;
        this.turns = turns;
        this.isActive = isActive;
    }

    public UUID getGameID() {
        return gameID;
    }

    public void setGameID(UUID gameID) {
        this.gameID = gameID;
    }

    public List<TurnDTO> getTurns() {
        return turns;
    }

    public void setTurns(List<TurnDTO> turns) {
        this.turns = turns;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
