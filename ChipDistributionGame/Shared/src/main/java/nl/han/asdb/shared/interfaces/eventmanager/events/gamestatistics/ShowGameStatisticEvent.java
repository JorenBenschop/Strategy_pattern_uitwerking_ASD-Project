package nl.han.asdb.shared.interfaces.eventmanager.events.gamestatistics;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import java.util.UUID;

public class ShowGameStatisticEvent extends Event{

    public ShowGameStatisticEvent(UUID eventUuid) {
        super(eventUuid);
    }
}
