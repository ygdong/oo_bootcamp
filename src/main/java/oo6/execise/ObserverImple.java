package oo6.execise;

public class ObserverImple  implements Observer{
    @Override
    public void receive(Event event) {
        if (event.getEventType().equals(EventType.天文学)){
            event.getEventSource().praise();
        }
    }
}
