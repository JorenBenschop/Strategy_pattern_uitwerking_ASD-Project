package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.HashMap;
import java.util.UUID;

public class AgentGoThroughRulesEvent extends Event {
    private UUID agentUuid;
    private UUID playerId;
    private HashMap<String, String> rules;

    public AgentGoThroughRulesEvent() {
        this.eventType = EventType.AgentGoThroughRulesEvent;
    }
    public AgentGoThroughRulesEvent(UUID eventUuid, UUID agentUuid, UUID playerId, HashMap<String, String> rules) {
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.playerId = playerId;
        this.rules = rules;
        this.eventType = EventType.AgentGoThroughRulesEvent;
    }


    public UUID getAgentUuid() {
        return agentUuid;
    }

    public void setAgentUuid(UUID agentUuid) {
        this.agentUuid = agentUuid;
    }

    public UUID getPlayerId() {
        return playerId;
    }

    public void setPlayerId(UUID playerId) {
        this.playerId = playerId;
    }

    public HashMap<String, String> getRules() {
        return rules;
    }

    public void setRules(HashMap<String, String> rules) {
        this.rules = rules;
    }
}
