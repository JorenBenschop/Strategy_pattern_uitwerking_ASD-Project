package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.comparison.comparable;

public class AgentComparableDTO {
    private AgentComparableTypeDTO comparableType;
    private int turnNumberInThePast;
    private int turnNumber;

    public AgentComparableDTO() {
    }

    public AgentComparableDTO(AgentComparableTypeDTO comparableType, int turnNumberInThePast, int turnNumber) {
        this.comparableType = comparableType;
        this.turnNumberInThePast = turnNumberInThePast;
        this.turnNumber = turnNumber;
    }

    public AgentComparableTypeDTO getComparableType() {
        return comparableType;
    }

    public void setComparableType(AgentComparableTypeDTO comparableType) {
        this.comparableType = comparableType;
    }

    public int getTurnNumberInThePast() {
        return turnNumberInThePast;
    }

    public void setTurnNumberInThePast(int turnNumberInThePast) {
        this.turnNumberInThePast = turnNumberInThePast;
    }

    public int getTurnNumber() {
        return turnNumber;
    }

    public void setTurnNumber(int turnNumber) {
        this.turnNumber = turnNumber;
    }
}
