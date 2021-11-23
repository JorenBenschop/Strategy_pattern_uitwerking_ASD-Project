package nl.han.asdb.shared.dto.agenthostservice.agentrule;

import nl.han.asdb.shared.dto.agenthostservice.agentrule.agentaction.IAgentActionDTO;
import nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.AgentConditionDTO;

import java.util.List;

public class AgentRuleDTO {
    private List<AgentConditionDTO> conditions;
    private List<IAgentActionDTO> actions;

    public AgentRuleDTO() {
    }

    public AgentRuleDTO(List<AgentConditionDTO> conditions, List<IAgentActionDTO> actions) {
        this.conditions = conditions;
        this.actions = actions;
    }

    public List<AgentConditionDTO> getConditions() {
        return conditions;
    }

    public void setConditions(List<AgentConditionDTO> conditions) {
        this.conditions = conditions;
    }

    public List<IAgentActionDTO> getActions() {
        return actions;
    }

    public void setActions(List<IAgentActionDTO> actions) {
        this.actions = actions;
    }
}
