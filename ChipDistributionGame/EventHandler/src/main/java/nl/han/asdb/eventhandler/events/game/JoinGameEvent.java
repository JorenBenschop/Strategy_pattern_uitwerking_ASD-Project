package nl.han.asdb.eventhandler.events.game;

import java.util.*;

public class JoinGameEvent {
    private String UUID;
    private String GameUUID;
    private List<String> PeerIPs=new ArrayList<String>();

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public List<String> getPeerIPs() {
        return PeerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.PeerIPs = peerIPs;
    }

    public String getGameUUID() {
        return GameUUID;
    }

    public void setGameUUID(String gameUUID) {
        this.GameUUID = gameUUID;
    }
}
