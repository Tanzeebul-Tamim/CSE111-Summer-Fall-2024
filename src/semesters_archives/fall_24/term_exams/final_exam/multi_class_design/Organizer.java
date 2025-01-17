package semesters_archives.fall_24.term_exams.final_exam.multi_class_design;

public class Organizer {
    private Event[] events;
    private int eventCount;
    private String name;

    public Organizer(String name) {
        if (name.isEmpty()) {
            System.out.println("Please provide the organizer's name");
        } else {
            this.name = name;
            this.events = new Event[4];
        }
    }

    public Organizer() {
        this("");
    }

    public void organizeEvent(Event event) {
        if (this.eventCount < this.events.length) {
            System.out.printf("%s successfully organized %s\n", this.name, event.getName());
            this.events[eventCount++] = event;
        }
    }

    public void searchEventByDate(String date) {
        boolean found = false;

        for (Event event : this.events) {
            if (event != null) {
                if (event.date.equals(date)) {
                    System.out.println(event.getName());
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.printf("No event is scheduled for %s\n", date);
        }
    }
}
