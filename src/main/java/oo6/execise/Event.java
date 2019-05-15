package oo6.execise;

public class Event {

    private Circle eventSource;


    private String eventMessage;

    private EventType eventType;

    public Circle getEventSource() {
        return eventSource;
    }

    public void setEventSource(Circle eventSource) {
        this.eventSource = eventSource;
    }


    public String getEventMessage() {
        return eventMessage;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }
}
