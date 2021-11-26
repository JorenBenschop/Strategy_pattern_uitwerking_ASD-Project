package nl.han.asdb.shared.interfaces.eventmanager.events.game;


import java.util.*;

public class StopGameEvent {
    private String gameUuid;
    private List<String> peerIPs=new ArrayList<String>();
}
