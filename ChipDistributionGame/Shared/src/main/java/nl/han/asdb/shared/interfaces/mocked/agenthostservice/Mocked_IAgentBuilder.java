package nl.han.asdb.shared.interfaces.mocked.agenthostservice;

import nl.han.asdb.shared.dto.agenthostservice.AgentDTO;
import nl.han.asdb.shared.interfaces.agenthostservice.IAgentBuilder;

public class Mocked_IAgentBuilder implements IAgentBuilder {
    @Override
    public void createAgent(AgentDTO agent) {

    }

    @Override
    public AgentDTO readAgent() {
        return null;
    }

    @Override
    public void deleteAgent() {

    }

    @Override
    public AgentDTO updateAgent(AgentDTO agent) {
        return null;
    }
}
