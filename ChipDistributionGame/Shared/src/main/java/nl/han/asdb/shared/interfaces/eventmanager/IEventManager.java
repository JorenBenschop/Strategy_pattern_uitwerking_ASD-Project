package nl.han.asdb.shared.interfaces.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import java.util.ArrayList;

public interface IEventManager {
    void subscribe(EventType event, IListener listener);
    void unsubscribe(EventType event, IListener listener) throws EventNotFoundException;
    void notify(Event event) throws EventNotFoundException;
}
