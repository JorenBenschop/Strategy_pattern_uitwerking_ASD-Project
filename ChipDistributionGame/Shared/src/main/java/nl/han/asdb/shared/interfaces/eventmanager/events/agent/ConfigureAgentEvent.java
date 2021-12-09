package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class ConfigureAgentEvent extends Event {
    private final UUID playerId;
    private final UUID agentUuid;
    private final String agentName;
    private final String agentCode;

    public ConfigureAgentEvent(UUID eventUuid, UUID playerUuid, UUID agentUuid, String agentName, String agentCode){
        super(eventUuid);
        this.playerId = playerUuid;
        this.agentUuid = agentUuid;
        this.agentName = agentName;
        this.agentCode = agentCode;
        this.eventType = EventType.ConfigureAgentEvent;
    }

    public UUID getAgentUuid() {
        return playerId;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public UUID getPlayerId() {
        return agentUuid;
    }

    public String getAgentName() {
        return agentName;
    }
}