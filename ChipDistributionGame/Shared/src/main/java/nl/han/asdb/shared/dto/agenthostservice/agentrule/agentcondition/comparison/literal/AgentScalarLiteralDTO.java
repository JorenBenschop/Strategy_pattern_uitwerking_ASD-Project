package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.comparison.literal;

public class AgentScalarLiteralDTO implements IAgentLiteralDTO {
    private int value;

    public AgentScalarLiteralDTO() {
    }

    public AgentScalarLiteralDTO(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
