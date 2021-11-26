package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class TakeControlFromAgentEvent extends Event {
    private UUID agentUuid;

    public TakeControlFromAgentEvent(){
    }

    public TakeControlFromAgentEvent(UUID agentUuid){
        this.agentUuid = agentUuid;
    }

    public UUID getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.agentUuid = agentUuid;
    }
}
