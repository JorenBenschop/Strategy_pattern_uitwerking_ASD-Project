package nl.han.asdb.dependencycontainer;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;

public class DependencyContainer extends AbstractModule {
    @Override
    protected void configure() {
        // bindings here.
        //bind(IEventManager.class).to(EventManager.class).in(Singleton.class);
        //bind(ITesTKlasse.class).to(TestKlasse.class);
    }
}
