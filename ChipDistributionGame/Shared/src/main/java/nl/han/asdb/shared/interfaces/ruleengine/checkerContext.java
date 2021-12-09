package nl.han.asdb.shared.interfaces.ruleengine;


import nl.han.asdb.shared.interfaces.eventmanager.events.Event;

public class checkerContext {
        private IcheckerStrategy strategy;
        private Event event;

        public void Context(IcheckerStrategy strategy){
            this.strategy = strategy;
        }

        public void executeStrategy(Event event) throws EventValueIncompleteException {
            strategy.checkAnEvent(event);
        }
    }


