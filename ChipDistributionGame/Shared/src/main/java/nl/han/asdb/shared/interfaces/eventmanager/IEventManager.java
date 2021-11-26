package nl.han.asdb.shared.interfaces.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public interface IEventManager {
    void subscribe(Event event, IListener listener);
    void unsubscrive(Event event, IListener listener) throws ClassNotFoundException;
    void notify(Event event) throws ClassNotFoundException;
}
