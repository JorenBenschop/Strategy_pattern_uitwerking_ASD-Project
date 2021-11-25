package nl.han.asdb.eventhandler.events.database;

import nl.han.asdb.eventhandler.events.Event;
import java.util.*;

public class SychroniseGameEvent extends Event {
    private String agentUuid;
    private List<String> peerIps =new ArrayList<String>();

    public String getAgentUUID() {
        return agentUuid;
    }

    public void setAgentUUID(String agentUUID) {
        this.agentUuid = agentUUID;
    }

    public List<String> getPeerIps() {
        return peerIps;
    }

    public void setPeerIps(List<String> peerIps) {
        this.peerIps = peerIps;
    }
}
