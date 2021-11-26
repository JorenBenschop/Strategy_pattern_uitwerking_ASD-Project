package nl.han.asdb.shared.interfaces.eventmanager.events.game;

public class SetupGameEvent {
    private String uuid;
    private String ip;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
