package nl.han.asdb.shared.interfaces.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.ArrayList;

public interface IEventManager {
    void subscribe(Event event, IListener listener);
    void unsubscribe(Event event, IListener listener) throws ClassNotFoundException;
    void notify(Event event) throws ClassNotFoundException;
}
