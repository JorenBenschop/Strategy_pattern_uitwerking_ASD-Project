package nl.han.asdb.shared.interfaces.agenthostservice;

import nl.han.asdb.shared.dto.agenthostservice.AgentDTO;

public interface IAgentBuilder {
    void createAgent(AgentDTO agent);
    AgentDTO readAgent();
    void deleteAgent();
    AgentDTO updateAgent(AgentDTO agent);
}
