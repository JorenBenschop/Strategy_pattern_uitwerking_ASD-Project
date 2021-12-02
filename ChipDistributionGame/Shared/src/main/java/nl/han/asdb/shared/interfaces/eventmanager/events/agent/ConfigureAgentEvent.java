package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.UUID;

public class ConfigureAgentEvent extends Event {
    private UUID playerId;
    private String agentCode; // string

    public ConfigureAgentEvent(){
        this.eventType = EventType.ConfigureAgentEvent;
    }

    public ConfigureAgentEvent(UUID eventUuid, UUID agentUuid, String agentCode){
        super(eventUuid);
        this.playerId = agentUuid;
        this.agentCode = agentCode;
        this.eventType = EventType.ConfigureAgentEvent;
    }

    public UUID getAgentUuid() {
        return playerId;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.playerId = agentUuid;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }
}
