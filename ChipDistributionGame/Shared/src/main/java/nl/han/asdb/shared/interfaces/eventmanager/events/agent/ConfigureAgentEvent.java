package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class ConfigureAgentEvent extends Event {
    private final UUID playerId;
    private final String agentCode; // string

    public ConfigureAgentEvent(UUID eventUuid, UUID agentUuid, String agentCode){
        super(eventUuid);
        this.playerId = agentUuid;
        this.agentCode = agentCode;
        this.eventType = EventType.ConfigureAgentEvent;
    }

    public UUID getAgentUuid() {
        return playerId;
    }

    public String getAgentCode() {
        return agentCode;
    }
}
