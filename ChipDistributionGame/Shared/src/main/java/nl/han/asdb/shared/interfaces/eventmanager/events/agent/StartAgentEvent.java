package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class StartAgentEvent extends Event{
    private UUID agentUuid;
    private UUID playerId;

    public StartAgentEvent(){
        this.eventType = EventType.StartAgentEvent;
    }

    public StartAgentEvent(UUID eventUuid, UUID agentUuid){
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.eventType = EventType.StartAgentEvent;
    }

    public UUID getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.agentUuid = agentUuid;
    }
}
