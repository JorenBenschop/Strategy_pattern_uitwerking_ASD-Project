package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class AgentTakesControlEvent extends Event{
    private final UUID agentUuid;
    private final UUID playerId;

    public AgentTakesControlEvent(UUID eventUuid, UUID agentUuid, UUID playerId){
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.playerId = playerId;
        this.eventType = EventType.AgentTakesControlEvent;
    }

    public UUID getAgentUUID() {
        return agentUuid;
    }

    public UUID getPlayerId() { return playerId; }
}
