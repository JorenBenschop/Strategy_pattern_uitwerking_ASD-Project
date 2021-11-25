package nl.han.asdb.eventhandler.events.agent;

import nl.han.asdb.eventhandler.events.Event;

public class TakeControlFromAgentEvent extends Event {
    private String agentUuid;

    public String getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(String agentUuid) {
        this.agentUuid = agentUuid;
    }
}
