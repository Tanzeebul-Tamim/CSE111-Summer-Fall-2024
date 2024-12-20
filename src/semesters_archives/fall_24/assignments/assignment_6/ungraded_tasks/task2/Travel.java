package semesters_archives.fall_24.assignments.assignment_6.ungraded_tasks.task2;

public class Travel {
    private static int count;

    private String source;
    private String destination;
    private int time;

    public Travel(String source, String destination) {
        this.source = source;
        this.destination = destination;
        this.time = 1;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String displayTravelInfo() {
        String source = "Source: " + this.source;
        String destination = "Destination: " + this.destination;
        String time = "Flight Time: " + this.time +":00";
        String output = source + "\n" + destination + "\n" + time;
        return output;
    }
}
