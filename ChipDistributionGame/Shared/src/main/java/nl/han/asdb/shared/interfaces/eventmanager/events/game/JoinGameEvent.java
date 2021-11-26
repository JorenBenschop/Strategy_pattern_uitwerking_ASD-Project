package nl.han.asdb.shared.interfaces.eventmanager.events.game;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JoinGameEvent extends Event{
    private UUID uuid;
    private UUID GameUuid;
    private List<String> peerIPs =new ArrayList<String>();

    public JoinGameEvent(){}

    public JoinGameEvent(UUID eventUuid, UUID uuid, UUID gameUuid, List<String> peerIPs) {
        super(eventUuid);
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
