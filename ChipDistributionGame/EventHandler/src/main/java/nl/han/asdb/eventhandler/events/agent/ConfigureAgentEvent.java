package nl.han.asdb.eventhandler.events.agent;

import nl.han.asdb.eventhandler.events.Event;

public class ConfigureAgentEvent extends Event {
    private String AgentUUID;
    //AgentCode.file + getter/setter

    public String getAgentUUID() {
        return AgentUUID;
    }

    public void setAgentUUID(String agentUUID) {
        AgentUUID = agentUUID;
    }
}
