package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class ConfigureAgentEvent extends Event {
    private String agentUuid;
    //AgentCode.file + getter/setter

    public String getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(String agentUuid) {
        this.agentUuid = agentUuid;
    }
}
