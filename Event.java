
import java.util.Date;

public class Event {
    String name;
    long timestamp;

    public Event(String name) {
        this.name = name;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "[" + new Date(timestamp) + "] " + name;
    }
}