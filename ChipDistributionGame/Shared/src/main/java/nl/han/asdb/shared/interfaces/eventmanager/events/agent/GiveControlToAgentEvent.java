package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class GiveControlToAgentEvent extends Event{
    private String agentUuid;

    public String getAgentUUID() {
        return agentUuid;
    }

    public void setAgentUUID(String agentUUID) {
        this.agentUuid = agentUUID;
    }
}
