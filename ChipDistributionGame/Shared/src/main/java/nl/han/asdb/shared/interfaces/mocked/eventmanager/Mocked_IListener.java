package nl.han.asdb.shared.interfaces.mocked.eventmanager;

import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;
import nl.han.asdb.shared.interfaces.eventmanager.IListener;
import nl.han.asdb.shared.interfaces.eventmanager.events.Event;
import nl.han.asdb.shared.interfaces.eventmanager.events.game.SellChipsEvent;

public class Mocked_IListener implements IListener {
    private boolean isUpdateFired = false;
    private IEventManager eventManager = new Mocked_IEventManager();

    @Override
    public void update(Event event) {
        this.isUpdateFired = true;
    }

    public boolean isUpdateFired() {
        return isUpdateFired;
    }

    public void main(){
        SellChipsEvent event = new SellChipsEvent();
        event.setAmount((short) 1000);
        this.eventManager.subscribe(event, this);
    }
}
