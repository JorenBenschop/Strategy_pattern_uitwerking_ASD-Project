package nl.han.asdb.shared.interfaces.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class TestKlas implements IListener{
    @Override
    public void subscribe(Event event, IListener listener) {

    }

    @Override
    public void unsubscrive(Event event, IListener listener) throws ClassNotFoundException {

    }

    @Override
    public void notify(Event event) throws ClassNotFoundException {

    }

    @Override
    public void update(Event event) {

    }
}


