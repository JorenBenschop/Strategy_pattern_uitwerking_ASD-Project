package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition;

import nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.comparison.AgentComparisonDTO;

public class AgentConditionDTO {
    private AgentConditionDTO leftCondition;
    private AgentConnectiveDTO connective;
    private AgentConditionDTO rightCondition;
    private AgentComparisonDTO comparison;

    public AgentConditionDTO() {
        leftCondition = null;
        connective = null;
        rightCondition = null;
        comparison = null;
    }

    public AgentConditionDTO(AgentConditionDTO leftCondition, AgentConnectiveDTO connective, AgentConditionDTO rightCondition, AgentComparisonDTO comparison) {
        this.leftCondition = leftCondition;
        this.connective = connective;
        this.rightCondition = rightCondition;
        this.comparison = comparison;
    }

    public AgentConditionDTO getLeftCondition() {
        return leftCondition;
    }

    public void setLeftCondition(AgentConditionDTO leftCondition) {
        this.leftCondition = leftCondition;
    }

    public AgentConnectiveDTO getConnective() {
        return connective;
    }

    public void setConnective(AgentConnectiveDTO connective) {
        this.connective = connective;
    }

    public AgentConditionDTO getRightCondition() {
        return rightCondition;
    }

    public void setRightCondition(AgentConditionDTO rightCondition) {
        this.rightCondition = rightCondition;
    }

    public AgentComparisonDTO getComparison() {
        return comparison;
    }

    public void setComparison(AgentComparisonDTO comparison) {
        this.comparison = comparison;
    }
}
