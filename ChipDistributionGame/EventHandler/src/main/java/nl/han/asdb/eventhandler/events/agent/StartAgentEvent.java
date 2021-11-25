package nl.han.asdb.eventhandler.events.agent;

import nl.han.asdb.eventhandler.events.Event;

public class StartAgentEvent extends Event{
    private String AgentUUID;

    public String getAgentUUID() {
        return AgentUUID;
    }

    public void setAgentUUID(String agentUUID) {
        AgentUUID = agentUUID;
    }
}
