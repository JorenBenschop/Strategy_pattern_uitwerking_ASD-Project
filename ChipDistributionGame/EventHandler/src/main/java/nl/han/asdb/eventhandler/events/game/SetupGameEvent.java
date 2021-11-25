package nl.han.asdb.eventhandler.events.game;

public class SetupGameEvent {
    private String UUID;
    private String IP;

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
}
