package nl.han.asdb.shared.dto;

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
}
