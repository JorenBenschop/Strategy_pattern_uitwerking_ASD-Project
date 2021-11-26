package nl.han.asdb.shared.interfaces.eventmanager.events.game;


import java.util.*;

public class StopGameEvent {
    private UUID gameUuid;
    private List<String> peerIPs=new ArrayList<String>();

    public StopGameEvent(){}

    public StopGameEvent(UUID gameUuid, List<String> peerIPs) {
        this.gameUuid = gameUuid;
        this.peerIPs = peerIPs;
    }

    public UUID getGameUuid() {
        return gameUuid;
    }

    public void setGameUuid(UUID gameUuid) {
        this.gameUuid = gameUuid;
    }

    public List<String> getPeerIPs() {
        return peerIPs;
    }

    public void setPeerIPs(List<String> peerIPs) {
        this.peerIPs = peerIPs;
    }
}
