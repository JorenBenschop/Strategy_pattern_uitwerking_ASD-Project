package nl.han.asdb.eventhandler.events.agent;

import nl.han.asdb.eventhandler.events.Event;

public class GiveControlToAgentEvent extends Event{
    private String agentUuid;

    public String getAgentUUID() {
        return agentUuid;
    }

    public void setAgentUUID(String agentUUID) {
        this.agentUuid = agentUUID;
    }
}
