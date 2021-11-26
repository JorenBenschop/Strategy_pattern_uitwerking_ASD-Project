package nl.han.asdb.shared.interfaces.eventmanager.events.database;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import java.util.*;

public class SychroniseGameEvent extends Event {
    private UUID agentUuid;
    private List<String> peerIps =new ArrayList<String>();

    public SychroniseGameEvent(){
    }

    public SychroniseGameEvent(UUID agentUuid, List<String> peerIps) {
        this.agentUuid = agentUuid;
        this.peerIps = peerIps;
    }

    public UUID getAgentUUID() {
        return agentUuid;
    }

    public void setAgentUUID(UUID agentUUID) {
        this.agentUuid = agentUUID;
    }

    public List<String> getPeerIps() {
        return peerIps;
    }

    public void setPeerIps(List<String> peerIps) {
        this.peerIps = peerIps;
    }
}
