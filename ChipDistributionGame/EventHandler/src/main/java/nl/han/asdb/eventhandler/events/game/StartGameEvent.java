package nl.han.asdb.eventhandler.events.game;

import java.util.*;

public class StartGameEvent {
    private String UUID;
    private String IP;
    private List<String> PeerIPs=new ArrayList<String>();

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public List<String> getPeerIPs() {
        return PeerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.PeerIPs = peerIPs;
    }
}
