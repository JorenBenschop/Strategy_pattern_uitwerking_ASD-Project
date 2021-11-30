package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.dto.agenthostservice.AgentDTO;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class ConfigureAgentEvent extends Event {
    private UUID playerId;
    private String agentDTO; // string

    public ConfigureAgentEvent(){
        this.eventType = EventType.ConfigureAgentEvent;
    }

    public ConfigureAgentEvent(UUID eventUuid, UUID agentUuid, String agentDTO){
        super(eventUuid);
        this.playerId = agentUuid;
        this.agentDTO = agentDTO;
        this.eventType = EventType.ConfigureAgentEvent;
    }

    public UUID getAgentUuid() {
        return playerId;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.playerId = agentUuid;
    }

    public String getAgentDTO() {
        return agentDTO;
    }

    public void setAgentDTO(String agentDTO) {
        this.agentDTO = agentDTO;
    }
}
