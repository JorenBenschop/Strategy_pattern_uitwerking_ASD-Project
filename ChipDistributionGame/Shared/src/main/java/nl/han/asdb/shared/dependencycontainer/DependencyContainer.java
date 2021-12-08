package nl.han.asdb.shared.dependencycontainer;

import com.google.inject.Singleton;
import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;
import nl.han.asdb.shared.interfaces.mocked.eventmanager.Mocked_IEventManager;
import com.google.inject.AbstractModule;

public class DependencyContainer extends AbstractModule{
    @Override
    protected void configure() {
        bind(IEventManager.class).to(Mocked_IEventManager.class).in(Singleton.class);
    }
}
