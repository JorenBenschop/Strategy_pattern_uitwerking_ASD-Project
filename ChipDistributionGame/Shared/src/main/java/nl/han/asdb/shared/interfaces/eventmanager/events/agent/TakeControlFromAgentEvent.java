package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class TakeControlFromAgentEvent extends Event {
    private UUID agentUuid;
    private UUID playerId;

    public TakeControlFromAgentEvent(){
        this.eventType = EventType.TakeControlFromAgentEvent;
    }

    public TakeControlFromAgentEvent(UUID eventUuid, UUID agentUuid){
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.eventType = EventType.TakeControlFromAgentEvent;
    }

    public UUID getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.agentUuid = agentUuid;
    }
}
