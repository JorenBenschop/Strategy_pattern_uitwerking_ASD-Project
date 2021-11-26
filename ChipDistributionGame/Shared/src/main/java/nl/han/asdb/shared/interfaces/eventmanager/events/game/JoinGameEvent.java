package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.*;

public class JoinGameEvent {
    private String uuid;
    private String GameUuid;
    private List<String> peerIPs =new ArrayList<String>();

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }

    public String getGameUuid() {
        return GameUuid;
    }

    public void setGameUuid(String gameUuid) {
        this.GameUuid = gameUuid;
    }
}
