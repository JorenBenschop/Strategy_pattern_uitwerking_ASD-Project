package nl.han.asdb.shared.interfaces.ruleengine;

import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public interface IcheckerStrategy {
    checker Checker = new checker();

    void checkAnEvent(Event event) throws EventValueIncompleteException;

}