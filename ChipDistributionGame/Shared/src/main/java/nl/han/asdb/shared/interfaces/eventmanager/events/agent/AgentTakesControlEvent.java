package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class AgentTakesControlEvent extends Event{
    private UUID agentUuid;
    private UUID playerId;

    public AgentTakesControlEvent(){
        this.eventType = EventType.AgentTakesControlEvent;
    }

    public AgentTakesControlEvent(UUID eventUuid, UUID agentUuid){
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.eventType = EventType.AgentTakesControlEvent;
    }

    public UUID getAgentUUID() {
        return agentUuid;
    }

    public void setAgentUUID(UUID agentUUID) {
        this.agentUuid = agentUUID;
    }
}
