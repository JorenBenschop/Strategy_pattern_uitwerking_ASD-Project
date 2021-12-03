package nl.han.asdb.shared.interfaces.eventmanager.events.agent;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class AgentGoThroughRulesEvent extends Event {
    private final UUID agentUuid;
    private final UUID playerId;
    private HashMap<String, String> rules;

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

    public UUID getPlayerId() {
        return playerId;
    }

    public HashMap<String, String> getRules() {
        return rules;
    }
}
