package nl.han.asdb.shared.interfaces.eventmanager;

public class EventNotFoundException extends Exception{
    public EventNotFoundException(String msg){
        super(msg);
    }
}
