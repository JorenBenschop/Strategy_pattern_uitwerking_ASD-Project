package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import jdk.jfr.EventType;
import nl.han.asdb.shared.dto.agenthostservice.AgentDTO;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.UUID;

public class ConfigureAgentEvent extends Event {
    private UUID agentUuid;
    private AgentDTO agentDTO;
    public ConfigureAgentEvent(){
    }

    public ConfigureAgentEvent(UUID eventUuid, UUID agentUuid, AgentDTO agentDTO){
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.agentDTO = agentDTO;
    }

    public UUID getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.agentUuid = agentUuid;
    }

    public AgentDTO getAgentDTO() {
        return agentDTO;
    }

    public void setAgentDTO(AgentDTO agentDTO) {
        this.agentDTO = agentDTO;
    }
}
