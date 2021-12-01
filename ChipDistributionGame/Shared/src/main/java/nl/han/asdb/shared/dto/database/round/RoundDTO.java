package nl.han.asdb.shared.dto.database.round;

import nl.han.asdb.shared.dto.database.round.EntityActions.EntityActionsDTO;

import java.util.List;

public class RoundDTO {
    private int roundNumber;
    private int roundTime;
    private List<EntityActionsDTO> entityActions;

    public RoundDTO() {
    }

    public RoundDTO(int roundNumber, int roundTime, List<EntityActionsDTO> entityActions) {
        this.roundNumber = roundNumber;
        this.roundTime = roundTime;
        this.entityActions = entityActions;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public int getRoundTime() {
        return roundTime;
    }

    public void setRoundTime(int roundTime) {
        this.roundTime = roundTime;
    }

    public List<EntityActionsDTO> getEntityActions() {
        return entityActions;
    }

    public void setEntityActions(List<EntityActionsDTO> entityActions) {
        this.entityActions = entityActions;
    }
}
