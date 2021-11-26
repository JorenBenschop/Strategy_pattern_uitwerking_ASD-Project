package nl.han.asdb.shared.interfaces.mocked.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;
import nl.han.asdb.shared.interfaces.eventmanager.IListener;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;

@Singleton
public class Mocked_IEventManager implements IEventManager {
    private HashMap<Event, ArrayList<IListener>> listenersForEvents = new HashMap<>();


    @Override
    public void subscribe(Event event, IListener listener) {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).add(listener);
            return;
        }
        ArrayList<IListener> listenerList = new ArrayList<>();
        listenerList.add(listener);
        this.listenersForEvents.put(event, listenerList);
    }

    @Override
    public void unsubscribe(Event event, IListener listener) throws ClassNotFoundException {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).remove(listener);
            return;
        }
        throw new ClassNotFoundException();
    }

    @Override
    public void notify(Event event) throws ClassNotFoundException {
        if(this.listenersForEvents.containsKey(event)){
            this.listenersForEvents.get(event).forEach((listener -> listener.update(event)));
            return;
        }
        throw new ClassNotFoundException();
    }
    @Override
    public ArrayList<IListener> t(Event e){
        return this.listenersForEvents.get(e);
    }
}
