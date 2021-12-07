package nl.han.asdb.shared.dto.agenthostservice.agentrule;

import nl.han.asdb.shared.dto.agenthostservice.agentrule.agentcondition.AgentConditionDTO;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.List;

public class AgentRuleDTO {
    private AgentConditionDTO conditions;
    private List<Event> events;

    public AgentRuleDTO() {
    }

    public AgentRuleDTO(AgentConditionDTO conditions, List<Event> events) {
        this.conditions = conditions;
        this.events = events;
    }

    public AgentConditionDTO getConditions() {
        return conditions;
    }

    public void setConditions(AgentConditionDTO conditions) {
        this.conditions = conditions;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
}
