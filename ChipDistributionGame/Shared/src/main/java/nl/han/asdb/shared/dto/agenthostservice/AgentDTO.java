package nl.han.asdb.shared.dto.agenthostservice;

import nl.han.asdb.shared.dto.agenthostservice.agentrule.AgentRuleDTO;

import java.util.List;
import java.util.UUID;

public class AgentDTO {
    private UUID agentId;
    private UUID playerId;
    private List<AgentRuleDTO> agentRules;

    public AgentDTO() {
    }

    public AgentDTO(UUID agentId, UUID playerId, List<AgentRuleDTO> agentRules) {
        this.agentId = agentId;
        this.playerId = playerId;
        this.agentRules = agentRules;
    }

    public UUID getAgentId() {
        return agentId;
    }

    public void setAgentId(UUID agentId) {
        this.agentId = agentId;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public void setPlayerId(UUID playerId) {
        this.playerId = playerId;
    }

    public List<AgentRuleDTO> getAgentRules() {
        return agentRules;
    }

    public void setAgentRules(List<AgentRuleDTO> agentRules) {
        this.agentRules = agentRules;
    }
}
