package nl.han.asdb.shared.interfaces.eventmanager;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public interface IListener {
    void update(Event event);
}
