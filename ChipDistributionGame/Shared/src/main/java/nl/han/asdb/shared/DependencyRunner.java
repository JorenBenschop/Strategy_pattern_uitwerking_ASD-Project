package nl.han.asdb.shared;

import com.google.inject.Guice;
import com.google.inject.Injector;
import nl.han.asdb.shared.dependencycontainer.DependencyContainer;
import nl.han.asdb.shared.interfaces.eventmanager.IEventManager;


public class DependencyRunner {

    private static IEventManager eventManager;
    private static Injector dependencyContainer;

    public static void main(String[] args) {
        dependencyContainer = Guice.createInjector(new DependencyContainer());
        eventManager = dependencyContainer.getInstance(IEventManager.class);
    }


}
