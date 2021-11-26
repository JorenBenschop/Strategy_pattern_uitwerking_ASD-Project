package nl.han.asdb.shared.interfaces.mocked.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;
import nl.han.asdb.shared.interfaces.eventmanager.IListener;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import java.util.ArrayList;
import java.util.HashMap;

public class Mocked_IEventManager implements IEventManager {
    private HashMap<Event, ArrayList<IListener>> listenersForEvents;


    @Override
    public void subscribe(Event event, IListener listener) {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).add(listener);
        } else {
            ArrayList<IListener> listenerList = new ArrayList<>();
            listenerList.add(listener);
            this.listenersForEvents.put(event, listenerList);
        }
    }

    @Override
    public void unsubscrive(Event event, IListener listener) throws ClassNotFoundException {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).remove(listener);
        } else throw new ClassNotFoundException();
    }

    @Override
    public void notify(Event event) throws ClassNotFoundException {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).forEach((listener -> listener.update(event)));
        }  else throw new ClassNotFoundException();
    }
}
