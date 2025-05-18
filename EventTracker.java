
import java.util.*;

public class EventTracker {
    private static List<Event> events = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    System.out.println("🕛 Event tracker CLI started.Type 'help' for options.");

    while (true){
        System.out.print("> ");
        String input = scanner.nextLine().trim();
        String[] parts = input.split(" ", 2);
        String command = parts[0].toLowerCase();

        switch(command) {
            case "add" :
            if(parts.length < 2) {
                System.out.println("❗ Usage: add <event_name ");
            } else {
            addEvent(parts[1]);
            }
            break;

            case "show":
            showEvents();
            break;

            case "clear":
            clearEvents();
            break;

            case "exit":
            System.out.println("👋 Exiting tracker. Goodbye!!");
            return;
            
            case "help":
            printHelp();
            break;

            default:
            System.out.println("❓ Unknown command. Type 'help' for options.");
        }
      }
    }

    private static void addEvent(String name) {
        events.add(new Event(name));
        System.out.println("✅ Event added: " + name);
    }
    private static void showEvents() {
        if(events.isEmpty()) {
            System.out.println("📪 No events recorded yet.");
        } else {
            System.out.println("📃Events: ");
            for (Event e : events) {
                System.out.println("  - " + e);
            }
        }
    }

    private static void clearEvents() {
        events.clear();;
        System.out.println("🧹 All events cleared.");
    }

    private static void printHelp() {
        System.out.println("""
         🔨 Commands:        
               add <event_name> - Add an event with the current timestamp
               show             - Show all recorded events
               clear            - Clear all events
               exit             - Exit the tracker 
        """);
    }

}