package semesters_archives.fall_24.term_exams.final_exam.multi_class_design;

public class Event {
    private static int eventCount;
    private static Event[] events;

    static {
        events = new Event[5];
    }

    private int id;
    private String name;
    public String date;

    public Event(String name, String date) {
        this.id = eventCount + 1;
        this.name = name;
        this.date = date;
        events[eventCount++] = this;
    }

    public String details() {
        return "Name: " + this.name + "\nDate: " + this.date;
    }

    public String getName() {
        return this.name;
    }

    public static void allEventInfo() {
        System.out.printf("Total Events: %d\nEvent Details:\n", eventCount);

        for (Event event : events) {
            if (event != null) {
                System.out.printf("Event %d:\n", event.id);
                System.out.println(event.details());
            }
        }
    }
}
