package nl.han.asdb.eventhandler.events.database;

import nl.han.asdb.eventhandler.events.Event;
import java.util.*;

public class SychroniseGameEvent extends Event {
    private String AgentUUID;
    private List<String> PeerIPs=new ArrayList<String>();

    public String getAgentUUID() {
        return AgentUUID;
    }

    public void setAgentUUID(String agentUUID) {
        AgentUUID = agentUUID;
    }

    public List<String> getPeerIPs() {
        return PeerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        PeerIPs = peerIPs;
    }
}
