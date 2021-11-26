package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class StartAgentEvent extends Event{
    private String agentUuid;

    public String getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(String agentUuid) {
        this.agentUuid = agentUuid;
    }
}
