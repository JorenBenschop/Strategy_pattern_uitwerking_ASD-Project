package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class StartAgentEvent extends Event{
    private final UUID agentUuid;
    private final UUID playerId;

    public StartAgentEvent(UUID eventUuid, UUID agentUuid, UUID playerId){
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.playerId = playerId;
        this.eventType = EventType.StartAgentEvent;
    }

    public UUID getAgentUuid() {
        return agentUuid;
    }

    public UUID getPlayerId() {return playerId;}
}
