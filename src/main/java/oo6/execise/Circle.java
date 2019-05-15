package oo6.execise;

import java.util.ArrayList;
import java.util.List;

public class Circle {

    private int praiseCount;

    private List<Observer>  observers =new ArrayList<>();

    public void publish(){
        Event event = new Event();
        event.setEventMessage("科学家最近发现一个新的黑洞");
        event.setEventType(EventType.天文学);

        for (Observer observer:observers){

            observer.receive(event);
        }

    }

    public void praise() {
        praiseCount++;
    }
}
