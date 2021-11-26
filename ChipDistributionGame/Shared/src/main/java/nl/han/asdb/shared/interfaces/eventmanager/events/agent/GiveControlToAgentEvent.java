package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class GiveControlToAgentEvent extends Event{
    private UUID agentUuid;

    public GiveControlToAgentEvent(){
    }

    public GiveControlToAgentEvent(UUID agentUuid){
        this.agentUuid = agentUuid;
    }

    public UUID getAgentUUID() {
        return agentUuid;
    }

    public void setAgentUUID(UUID agentUUID) {
        this.agentUuid = agentUUID;
    }
}
