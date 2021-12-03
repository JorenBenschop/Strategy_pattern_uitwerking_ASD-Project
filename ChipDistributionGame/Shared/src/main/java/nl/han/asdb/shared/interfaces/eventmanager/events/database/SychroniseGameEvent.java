package nl.han.asdb.shared.interfaces.eventmanager.events.database;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.*;

public class SychroniseGameEvent extends Event {
    private final UUID agentUuid;
    private List<String> peerIps =new ArrayList<String>();

    public SychroniseGameEvent(UUID eventUuid, UUID agentUuid, List<String> peerIps) {
        super(eventUuid);
        this.agentUuid = agentUuid;
        this.peerIps = peerIps;
        this.eventType = EventType.SynchroniseGameEvent;
    }

    public UUID getAgentUUID() {
        return agentUuid;
    }

    public List<String> getPeerIps() {
        return peerIps;
    }
}
