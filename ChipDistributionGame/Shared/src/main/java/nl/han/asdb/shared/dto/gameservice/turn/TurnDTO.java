package nl.han.asdb.shared.dto.gameservice.turn;

import nl.han.asdb.shared.dto.gameservice.turn.entity.EntityDTO;

import java.util.List;

public class TurnDTO {

    private int turnNumber;
    private List<EntityDTO> entities;

    public TurnDTO() {

    }

    public TurnDTO(int turnNumber, List<EntityDTO> entities) {
        this.turnNumber = turnNumber;
        this.entities = entities;
    }


    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public List<EntityDTO> getEntities() {
        return entities;
    }

    public void setEntities(List<EntityDTO> entities) {
        this.entities = entities;
    }
}
