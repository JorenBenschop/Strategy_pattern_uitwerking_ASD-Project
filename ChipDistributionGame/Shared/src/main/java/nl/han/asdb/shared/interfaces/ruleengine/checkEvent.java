package nl.han.asdb.shared.interfaces.ruleengine;


import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public interface checkEvent {

    boolean checkAnEvent(Event event);

}
