import com.google.inject.Guice;
import com.google.inject.Injector;
import nl.han.asdb.dependencycontainer.DependencyContainer;

public class Main {
    private static Injector injector;
    // private static ITestKlasse test;

    public static void main(String[] args) {
        injector = Guice.createInjector(new DependencyContainer());
        // test = injector.getInstance(TestKlasse.class)
    }
}
