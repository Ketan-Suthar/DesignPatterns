public class Event{
    private String eventName;
    public Event(final String eventName) {
        this.eventName = eventName;
    }

    public boolean doubleClick() {
        return eventName.equalsIgnoreCase("doubleClick");
    }
}
