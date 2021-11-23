package nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.comparison;

import nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.comparison.comparable.IAgentComparableDTO;
import nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.comparison.literal.IAgentLiteralDTO;

import java.util.List;

public class AgentComparisonDTO {
    private List<IAgentComparableDTO> comparables;
    private AgentComparisonOperatorDTO comparisonOperator;
    private List<IAgentLiteralDTO> literals;

    public AgentComparisonDTO() {
    }

    public AgentComparisonDTO(List<IAgentComparableDTO> comparables, AgentComparisonOperatorDTO comparisonOperator, List<IAgentLiteralDTO> literals) {
        this.comparables = comparables;
        this.comparisonOperator = comparisonOperator;
        this.literals = literals;
    }

    public List<IAgentComparableDTO> getComparables() {
        return comparables;
    }

    public void setComparables(List<IAgentComparableDTO> comparables) {
        this.comparables = comparables;
    }

    public AgentComparisonOperatorDTO getComparisonOperator() {
        return comparisonOperator;
    }

    public void setComparisonOperator(AgentComparisonOperatorDTO comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public List<IAgentLiteralDTO> getLiterals() {
        return literals;
    }

    public void setLiterals(List<IAgentLiteralDTO> literals) {
        this.literals = literals;
    }
}
