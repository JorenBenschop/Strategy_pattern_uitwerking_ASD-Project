package nl.han.asdb.shared.interfaces.mocked.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.EventNotFoundException;
import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;
import nl.han.asdb.shared.interfaces.eventmanager.IListener;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.EventType;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;

@Singleton
public class Mocked_IEventManager implements IEventManager {
    private HashMap<EventType, ArrayList<IListener>> listenersForEvents = new HashMap<>();

    @Override
    public void subscribe(EventType event, IListener listener) {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).add(listener);
            return;
        }
        ArrayList<IListener> listenerList = new ArrayList<>();
        listenerList.add(listener);
        this.listenersForEvents.put(event, listenerList);
    }

    @Override
    public void unsubscribe(EventType event, IListener listener) throws EventNotFoundException {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).remove(listener);
            return;
        }
        throw new EventNotFoundException("The event of eventType: " + event + " could not be found in the Listener list.");
    }

    @Override
    public void notify(Event event) throws EventNotFoundException {
        if(this.listenersForEvents.containsKey(event.getEventType())){
            this.listenersForEvents.get(event.getEventType()).forEach((listener -> listener.update(event)));
            return;
        }
        throw new EventNotFoundException("The event of eventType: " + event + " could not be found in the Listener list.");
    }
}
