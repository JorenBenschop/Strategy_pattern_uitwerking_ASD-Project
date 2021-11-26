package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import java.util.*;

public class JoinGameEvent {
    private UUID uuid;
    private UUID GameUuid;
    private List<String> peerIPs =new ArrayList<String>();

    public JoinGameEvent(){}

    public JoinGameEvent(UUID uuid, UUID gameUuid, List<String> peerIPs) {
        this.uuid = uuid;
        GameUuid = gameUuid;
        this.peerIPs = peerIPs;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }

    public UUID getGameUuid() {
        return GameUuid;
    }

    public void setGameUuid(UUID gameUuid) {
        this.GameUuid = gameUuid;
    }
}
